package com.ftn.Frima.app.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.Frima.app.models.FakturaModel;
import com.ftn.Frima.app.repository.FakturaRepsitory;

@Service
public class FakturaService {
	
	@Autowired
	private FakturaRepsitory fakturarep;

	public FakturaModel save(FakturaModel faktura) {
		return fakturarep.save(faktura);
	}

	public FakturaModel findFakturaById(Long fakturaId) {
		return fakturarep.findOne(fakturaId);
	}
	
	//koje su meni placene
	public Collection<FakturaModel> findByPibKupca(String pibKupca) {
		return fakturarep.findByPibKupca(pibKupca);
	}
	
	//fakture koje ja placam
	public Collection<FakturaModel> findByPibDobavljaca(String pibDobavljaca){
		return fakturarep.findByPibDobavljaca(pibDobavljaca);
	}
}
