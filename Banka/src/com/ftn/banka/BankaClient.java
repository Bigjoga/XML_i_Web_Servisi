package com.ftn.banka;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.ftn.schema.prenos.NalogZaPrenos;



public class BankaClient {
	 public void testIt1() {
	    	
			try {
				URL wsdlLocation = new URL("http://localhost:8080/banka/services/Banka?wsdl");
				QName serviceName = new QName("http://www.ftn.com/banka", "BankaService");
	            QName portName = new QName("http://www.ftn.com/banka", "Banka");

				Service service = Service.create(wsdlLocation, serviceName);
				
				Banka hello = service.getPort(portName, Banka.class); 
				
				NalogZaPrenos nalog=new NalogZaPrenos();

				
				boolean response = hello.slanjeNalogaZaPlacanje(nalog);
				System.out.println("Response from WS: " + response);
				
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
	    }
	    
	    public void testIt2() {
	    	//kreiranje web servisa sa generisanom klasom
	    	try {
				//kod za kreiranje service objekta iz prethodne metode je samo ugradjen u HelloDocumentService klasu
	    		BankaService service = new BankaService(new URL("http://localhost:8080/banka/services/Banka?wsdl"));
				
	    		//preuzimanje interfjesa
				Banka hello = service.getBanka();

	
				NalogZaPrenos nalog=new NalogZaPrenos();
	
				boolean response = hello.slanjeNalogaZaPlacanje(nalog);
				System.out.println("Response from WS: " + response);
				
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
	    }
		
		public static void main(String[] args) {
			
			BankaClient client = new BankaClient();
			client.testIt1();
			client.testIt2();
	    }
}
