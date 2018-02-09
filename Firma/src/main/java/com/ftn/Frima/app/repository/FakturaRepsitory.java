package com.ftn.Frima.app.repository;
import java.math.BigInteger;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ftn.Frima.app.models.FakturaModel;

public interface FakturaRepsitory extends JpaRepository<FakturaModel, Long>{
	
	public Collection<FakturaModel> findByPibKupca(String pibKupca);
	
	public Collection<FakturaModel> findByPibDobavljaca(String pibDobavljaca);

}
