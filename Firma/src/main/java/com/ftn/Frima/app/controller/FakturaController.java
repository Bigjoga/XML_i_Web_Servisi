package com.ftn.Frima.app.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ftn.Frima.app.models.FakturaModel;
import com.ftn.Frima.app.models.FakturaStavkaModel;
import com.ftn.Frima.app.service.FakturaService;
import com.ftn.Frima.app.service.FakturaStavkaService;

@RestController
@RequestMapping("faktura")
public class FakturaController {
	
	@Autowired
	private FakturaService fakturaService;
	@Autowired
	private FakturaStavkaService fakturaStavkaService;
	
	
	@RequestMapping(
			value = "/cuvanjeFakture",
			method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean save(@RequestBody FakturaModel faktura){
		fakturaService.save(faktura);
		if(fakturaService.save(faktura)==null){
			return false;
		}
		return true;
	}
	
	@RequestMapping(
			value = "/cuvanjeStavke/{fakturaId}",
			method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean  cuvanjeStavke(@RequestBody FakturaStavkaModel fakturaStavka, @PathVariable Long fakturaId){
		FakturaModel faktura = fakturaService.findFakturaById(fakturaId);
		if(faktura==null){
			return false;
		}
		fakturaStavka.setFaktura(faktura);
		FakturaStavkaModel stavka = fakturaStavkaService.save(fakturaStavka);
		
		return true;
		
	}
	
	@RequestMapping(
			value = "/faktureZaPlacanje/{pibFirme}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<FakturaModel> faktureZaPlacanje(@PathVariable String pibFirme){
		Collection<FakturaModel> faktureZaPlacanje = fakturaService.findByPibKupca(pibFirme);
		return faktureZaPlacanje;
	}
	
	@RequestMapping(
			value = "/faktureZaNaplatu/{pibFirme}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<FakturaModel> mojeIzlazneFakture(@PathVariable String pibFirme){
		Collection<FakturaModel> faktureZaNaplatu = fakturaService.findByPibDobavljaca(pibFirme);
		return faktureZaNaplatu;
	}
	


}
