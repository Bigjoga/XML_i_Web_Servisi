package com.ftn.Frima.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftn.Frima.app.models.RacunModel;
import com.ftn.Frima.app.repository.RacunRepository;

@Service
public class RacunService {


@Autowired
private RacunRepository racunRepository;
		
public RacunModel findByBrojRacuna(String brojRacuna) {
	return racunRepository.findByBrojRacuna(brojRacuna);
}

}
