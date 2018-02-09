package com.ftn.Frima.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.Frima.app.models.FakturaStavkaModel;
import com.ftn.Frima.app.repository.FakturaStavkaRepository;

@Service
public class FakturaStavkaService {

	@Autowired
	private FakturaStavkaRepository fakturastavkarep;
	

	public FakturaStavkaModel save(FakturaStavkaModel fakturaStavka) {
		return fakturastavkarep.save(fakturaStavka);
	}
	
}
