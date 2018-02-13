package com.ftn.Frima.app.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ftn.Frima.app.models.FrimaModel;
import com.ftn.Frima.app.models.RacunModel;
import com.ftn.Frima.app.models.nalog.NalogZaPrenos;
import com.ftn.Frima.app.repository.FirmaRepository;

@Service

public class FirmaService {

	@Autowired
	public FirmaRepository firmaRepository;
	
	public Collection<FrimaModel> findByPibNot(String pib) {
		return firmaRepository.findByPibNot(pib);
	}
	
	public Collection<FrimaModel> findByPib(String pib) {
		return firmaRepository.findByPib(pib);
	}
	
	public FrimaModel findById(Long id) {
		return firmaRepository.findById(id);
	}
	
	public void saveFirma(FrimaModel firma) {
		firmaRepository.save(firma);
	}
	
	public FrimaModel findByBrojRacuna(RacunModel racun){
		return firmaRepository.findByRacun(racun);
	}


}
