
package com.ftn.banka;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.6.5
 * 2018-02-13T18:47:35.857+01:00
 * Generated source version: 2.6.5
 * 
 */
 
public class Banka_Banka_Server{

    protected Banka_Banka_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new BankaImpl();
        String address = "http://localhost:8080/banka";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new Banka_Banka_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
