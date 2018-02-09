package com.ftn.Frima.app.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.Frima.app.models.FrimaModel;
import com.ftn.Frima.app.repository.FirmaRepository;

@Service

public class FirmaService {

	@Autowired
	private FirmaRepository firmaRepository;
	
	public Collection<FrimaModel> findByPibNot(String pib) {
		return firmaRepository.findByPibNot(pib);
	}
	
	public void saveFirma(FrimaModel firma) {
		firmaRepository.save(firma);
	}
	
	
	
}
