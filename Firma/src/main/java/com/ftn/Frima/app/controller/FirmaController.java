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
import com.ftn.Frima.app.service.FirmaService;

@RestController
@RequestMapping("firma")
public class FirmaController {

@Autowired
private FirmaService firmaService;
	
@RequestMapping(
		value = "/getOstala/{pib}",
		method = RequestMethod.GET,
		produces = MediaType.APPLICATION_JSON_VALUE)
public Collection<FrimaModel> getOstala(@PathVariable String pib){
	Collection<FrimaModel> preduzeca = firmaService.findByPibNot(pib);
	return preduzeca;
}

}
