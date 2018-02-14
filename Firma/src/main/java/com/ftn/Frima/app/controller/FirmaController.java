package com.ftn.Frima.app.controller;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;
import java.io.IOException;
import java.util.Collection;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ftn.Frima.app.models.FakturaModel;
import com.ftn.Frima.app.models.FrimaModel;
import com.ftn.Frima.app.models.RacunModel;
import com.ftn.Frima.app.models.izvod.Izvod;
import com.ftn.Frima.app.models.nalog.NalogZaPrenos;
import com.ftn.Frima.app.models.nalog.NalogZaPrenos.PodaciOPrenosu;
import com.ftn.Frima.app.models.nalog.TOsobaPrenos;
import com.ftn.Frima.app.models.zahtev.ZahtevZaIzvod;
import com.ftn.Frima.app.service.BankaService;
import com.ftn.Frima.app.service.FakturaService;
import com.ftn.Frima.app.service.FirmaService;
import com.ftn.Frima.app.service.RacunService;

@RestController
@RequestMapping("firma")
public class FirmaController {

@Autowired
private FirmaService firmaService;
@Autowired
private RacunService racunService;
@Autowired
private FakturaService fakturaService;
@Autowired
private BankaService bankaService;

@RequestMapping(
		value = "/getFirma/{id}",
		method = RequestMethod.GET,
		produces = MediaType.APPLICATION_JSON_VALUE)
public FrimaModel getFirma(@PathVariable Long id){
	FrimaModel firma = firmaService.findById(id);
	return firma;
}
	
@RequestMapping(
		value = "/getOstale/{pib}",
		method = RequestMethod.GET,
		produces = MediaType.APPLICATION_JSON_VALUE)
public Collection<FrimaModel> getOstale(@PathVariable String pib){
	Collection<FrimaModel> lista_firmi = firmaService.findByPibNot(pib);
	return lista_firmi;
}

@RequestMapping(
		value = "/getRacun/{br}",
		method = RequestMethod.GET,
		produces = MediaType.APPLICATION_JSON_VALUE)
public RacunModel getRacun(@PathVariable String br){
	RacunModel lista_firmi = racunService.findByBrojRacuna(br);
	return lista_firmi;
}

@RequestMapping(
		value = "/nalog/kreirajNalogZaPlacanje/{fakturaId}/{svrhaPlacanja}/{modelZaduzenja}/{pozivNaBrojZaduzenja}/{modelOdobrenja}/{pozivNaBrojOdobrenja}/{hitno}",
		method = RequestMethod.POST,
		produces = MediaType.APPLICATION_JSON_VALUE)
public NalogZaPrenos kreirajNalogZaPlacanje(@PathVariable Long fakturaId,@PathVariable String svrhaPlacanja,@PathVariable Long modelZaduzenja,@PathVariable String pozivNaBrojZaduzenja,@PathVariable Long modelOdobrenja,@PathVariable String pozivNaBrojOdobrenja,@PathVariable boolean hitno){
	
	FakturaModel f=fakturaService.findFakturaById(fakturaId);
	NalogZaPrenos nalog=new NalogZaPrenos();
	PodaciOPrenosu pop=new PodaciOPrenosu();
	pop.setPoverilacPrenos(new TOsobaPrenos());
	pop.setDuznikPrenos(new TOsobaPrenos());
	nalog.setPodaciOPrenosu(pop);

	
	
	nalog.setIdPoruke(UUID.randomUUID().toString().replaceAll("-", ""));
	nalog.setDuznikNalogodavac(f.getNazivKupca());
	nalog.setSvrhaPlacanja(svrhaPlacanja);
	nalog.setPrimalacPoverilac(f.getNazivDobavljaca());
	
	GregorianCalendar c = new GregorianCalendar();
	c.setTime(f.getDatumRacuna());
	XMLGregorianCalendar date2 = null;
	try {
		date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
	} catch (DatatypeConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	nalog.setDatumNaloga(date2);

	GregorianCalendar c2 = new GregorianCalendar();
	c2.setTime(f.getDatumValute());
	XMLGregorianCalendar date22 = null;
	try {
		date22 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c2);
	} catch (DatatypeConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	nalog.getPodaciOPrenosu().setDatumValute(date22);
	nalog.getPodaciOPrenosu().getDuznikPrenos().setBrojRacuna(f.getBrojRacuna());
	nalog.getPodaciOPrenosu().getDuznikPrenos().setModel(modelZaduzenja);
	nalog.getPodaciOPrenosu().getDuznikPrenos().setPozivNaBroj(pozivNaBrojZaduzenja);
	
	nalog.getPodaciOPrenosu().getPoverilacPrenos().setBrojRacuna(f.getUplataNaRacun());
	nalog.getPodaciOPrenosu().getPoverilacPrenos().setModel(modelOdobrenja);
	nalog.getPodaciOPrenosu().getPoverilacPrenos().setPozivNaBroj(pozivNaBrojOdobrenja);
	
	nalog.getPodaciOPrenosu().setIznos(f.getIznosZaUplatu());
	nalog.getPodaciOPrenosu().setOznakaValute(f.getOznakaValute());
	nalog.setHitno(hitno);
	
	try{
		RacunModel racun=racunService.findByBrojRacuna(f.getBrojRacuna());
		FrimaModel firma=firmaService.findByBrojRacuna(racun);
		boolean retVal = false;
        if (firma != null) {
            retVal = bankaService.posaljiNalogZaPrenos(nalog, firma);
        }
		
        return nalog;
	} catch (Exception e) {
		return nalog;
	}
}
	
	@RequestMapping(
			value = "/izvodi/preuzmiIzvod/{brojRacuna}/{datumRacuna}/{brojPreseka}",
			method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Izvod preuzmiIzvod(@PathVariable String brojRacuna,@PathVariable String datumRacuna,@PathVariable int brojPreseka) throws ParseException{
		
		
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date inputDate = dateFormat.parse(datumRacuna);
		
		ZahtevZaIzvod zahtev=new ZahtevZaIzvod();
		zahtev.setBrojRacuna(brojRacuna);
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(inputDate);
		XMLGregorianCalendar date2 = null;
		try {
			date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		zahtev.setDatum(date2);
		zahtev.setRedniBrojPreseka((long)brojPreseka);
		Izvod retVal = null;
		try{
			RacunModel racun=racunService.findByBrojRacuna(brojRacuna);
			FrimaModel firma=firmaService.findByBrojRacuna(racun);

	        if (firma != null) {
	            retVal = bankaService.preuzmiIzvod(zahtev, firma);
	        }
			System.out.println(retVal.toString());
	        return retVal;
		} catch (Exception e) {
			return retVal;
	}
		

}

}
