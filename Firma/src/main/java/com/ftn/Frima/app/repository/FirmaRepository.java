package com.ftn.Frima.app.repository;

import java.util.Collection;
import java.math.BigInteger;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftn.Frima.app.models.FrimaModel;

@Repository
public interface FirmaRepository extends JpaRepository<FrimaModel, Long>{

	public Collection<FrimaModel> findByPibNot(String pib);

}
