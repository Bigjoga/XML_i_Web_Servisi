package com.ftn.Frima.app.service;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import com.ftn.Frima.app.models.nalog.NalogZaPrenos;
import com.ftn.Frima.app.Banka.Banka;

import com.ftn.Frima.app.models.*;

import org.springframework.stereotype.Service;

@Service
public class BankaService {

	
	public boolean posaljiNalogZaPrenos(NalogZaPrenos nalog,FrimaModel firma){
		System.out.println("Usao u slanje naloga!");
		try {
			URL wsdlLocation = new URL("http://localhost:"+firma.getPortBanke()+"/banka/services/Banka?wsdl");
			QName serviceName = new QName("http://www.ftn.com/banka", "BankaService");
            QName portName = new QName("http://www.ftn.com/banka", "Banka");
            
            javax.xml.ws.Service service = javax.xml.ws.Service.create(wsdlLocation, serviceName);
			
			Banka hello = service.getPort(portName, Banka.class); 
		
			boolean response = hello.slanjeNalogaZaPlacanje(nalog);
			System.out.println("Response from WS: " + response);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
}
