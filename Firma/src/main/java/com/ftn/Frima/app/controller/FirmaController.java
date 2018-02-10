package com.ftn.Frima.app.controller;

import java.io.IOException;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ftn.Frima.app.models.FrimaModel;
import com.ftn.Frima.app.models.RacunModel;
import com.ftn.Frima.app.service.FirmaService;
import com.ftn.Frima.app.service.RacunService;

@RestController
@RequestMapping("firma")
public class FirmaController {

@Autowired
private FirmaService firmaService;

@Autowired
private RacunService racunService;

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

}
