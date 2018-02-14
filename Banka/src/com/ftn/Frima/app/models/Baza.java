package com.ftn.Frima.app.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.ftn.schema.mt102.TPojedinacnoPlacanje;

public class Baza {

	public static List<BankaModel> listaBanki=new ArrayList<BankaModel>();
	
	public static List<FrimaModel> listaFirmi=new ArrayList<FrimaModel>();
	
	public static List<TPojedinacnoPlacanje> listaPlacanja=new ArrayList<TPojedinacnoPlacanje>();
	
	public static void init(){
		//BAZA ZA BANKE
		
		BankaModel banka1=new BankaModel();
		banka1.setId((long) 8085);
		RacunModel b1=new RacunModel();
		b1.setBrojRacuna("8085-111111111111-11");
		b1.setRezervisanaSredstva(new BigDecimal(0));
		b1.setTrenutnoStanje(new BigDecimal(200000));
		banka1.setRacunBanke(b1);
		
		BankaModel banka2=new BankaModel();
		banka2.setId((long) 8085);
		RacunModel b2=new RacunModel();
		b2.setBrojRacuna("8086-222222222222-22");
		b2.setRezervisanaSredstva(new BigDecimal(0));
		b2.setTrenutnoStanje(new BigDecimal(200000));
		banka1.setRacunBanke(b2);
		
		BankaModel CB=new BankaModel();
		CB.setId((long) 8080);
		RacunModel cbr=new RacunModel();
		cbr.setBrojRacuna("8080-000000000000-00");
		cbr.setRezervisanaSredstva(new BigDecimal(0));
		cbr.setTrenutnoStanje(new BigDecimal(0));
		CB.setRacunBanke(cbr);
		
		saveBanka(banka1);
		saveBanka(banka2);
		saveBanka(CB);
		
		//BAZA ZA FIRME
		FrimaModel firmaA=new FrimaModel();
		firmaA.setId((long) 8081);
		RacunModel fA=new RacunModel();
		fA.setBrojRacuna("8085-333333333333-33");
		fA.setRezervisanaSredstva(new BigDecimal(0));
		fA.setTrenutnoStanje(new BigDecimal(200000));

		
		FrimaModel firmaB=new FrimaModel();
		firmaB.setId((long) 8082);
		RacunModel fB=new RacunModel();
		fB.setBrojRacuna("8086-444444444444-44");
		fB.setRezervisanaSredstva(new BigDecimal(0));
		fB.setTrenutnoStanje(new BigDecimal(200000));

		FrimaModel firma3=new FrimaModel();
		firma3.setId((long) 8083);
		RacunModel f3=new RacunModel();
		f3.setBrojRacuna("8086-555555555555-55");
		f3.setRezervisanaSredstva(new BigDecimal(0));
		f3.setTrenutnoStanje(new BigDecimal(200000));
		
		
		
		firmaA.setRacun(fA);
		firmaB.setRacun(fB);
		firma3.setRacun(f3);
		
		saveFirma(firmaA);
		saveFirma(firmaB);
		saveFirma(firma3);
		
	}



	public static List<BankaModel> getBankaModel() {
		return listaBanki;
	}
	
	

	public static List<FrimaModel> getListaFirmi() {
		return listaFirmi;
	}



	public static void setListaFirmi(List<FrimaModel> listaFirmi) {
		Baza.listaFirmi = listaFirmi;
	}



	public static void saveBanka(BankaModel bm){
		boolean bo=false;
		for(BankaModel bank:Baza.getBankaModel()){
			if(bank.getId().equals(bm.getId())){
				bo=true;
			}
		}
		if(bo==false){
			listaBanki.add(bm);
		}
	}
	
	public static void saveFirma(FrimaModel bm){
		boolean bo=false;
		for(FrimaModel bank:Baza.getListaFirmi()){
			if(bank.getId().equals(bm.getId())){
				bo=true;
			}
		}
		if(bo==false){
			listaFirmi.add(bm);
		}
	}

	public static void setBankaModel(List<BankaModel> bankaModel) {
		Baza.listaBanki = bankaModel;
	}
	
	public static BankaModel getBankByRacun(String racun){
		for(BankaModel bm:Baza.getBankaModel()){
			if(bm.getRacunBanke().getBrojRacuna().equals(racun)){
				return bm;
			}
		}
		return null;
		
	}
	
	public static FrimaModel getFirmaByRacun(String racun){
		for(FrimaModel bm:Baza.getListaFirmi()){
			if(bm.getRacun().getBrojRacuna().equals(racun)){
				return bm;
			}
		}
		return null;
		
	}

	public static List<TPojedinacnoPlacanje> getByDuznik(String racunPoverioca){
		List<TPojedinacnoPlacanje> lista=new ArrayList<TPojedinacnoPlacanje>();
		for(TPojedinacnoPlacanje pp:listaPlacanja){
			if(pp.getRacunPoverioca().equals(racunPoverioca)){
				lista.add(pp);
			}
		}

		return lista;
		
	}

	public static List<TPojedinacnoPlacanje> getListaPlacanja() {
		return listaPlacanja;
	}



	public static void setListaPlacanja(List<TPojedinacnoPlacanje> listaPlacanja) {
		Baza.listaPlacanja = listaPlacanja;
	}
	
	
}
