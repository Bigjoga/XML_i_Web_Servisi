package com.ftn.Frima.app.Banka;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;

/**
 * This class was generated by Apache CXF 2.6.5
 * 2018-02-09T14:56:35.663+01:00
 * Generated source version: 2.6.5
 * 
 */
@WebService(targetNamespace = "http://www.ftn.com/banka", name = "Banka")
@XmlSeeAlso({com.ftn.Frima.app.models.izvod.ObjectFactory.class, com.ftn.Frima.app.models.nalog.ObjectFactory.class, com.ftn.Frima.app.models.mt102.ObjectFactory.class, ObjectFactory.class, com.ftn.Frima.app.models.mt103.ObjectFactory.class, com.ftn.Frima.app.models.zahtev.ObjectFactory.class, com.ftn.Frima.app.models.mt910.ObjectFactory.class})
public interface Banka {

    @WebMethod
    @Oneway
    @RequestWrapper(localName = "clearSettleBanka", targetNamespace = "http://www.ftn.com/banka", className = "com.ftn.banka.ClearSettleBanka")
    public void clearSettleBanka(
        @WebParam(name = "mt102", targetNamespace = "")
        com.ftn.Frima.app.models.mt102.Mt102 mt102,
        @WebParam(name = "mt910", targetNamespace = "")
        com.ftn.Frima.app.models.mt910.Mt910 mt910
    );

    @WebMethod
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "odgovor-na-placanje", targetNamespace = "http://www.ftn.com/banka", partName = "odgovor")
    public boolean slanjeNalogaZaPlacanje(
        @WebParam(partName = "nalog", name = "nalog-za-prenos", targetNamespace = "http://www.ftn.com/schema/prenos")
        com.ftn.Frima.app.models.nalog.NalogZaPrenos nalog
    );

    @WebMethod
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "izvod", targetNamespace = "http://www.ftn.com/schema/izvod", partName = "izvod")
    public com.ftn.Frima.app.models.izvod.Izvod preuzimanjeIzvoda(
        @WebParam(partName = "zahtev", name = "zahtev-za-izvod", targetNamespace = "http://www.ftn.com/schema/zahtev")
        com.ftn.Frima.app.models.zahtev.ZahtevZaIzvod zahtev
    );

    @WebMethod
    @Oneway
    @RequestWrapper(localName = "rtgsBanka", targetNamespace = "http://www.ftn.com/banka", className = "com.ftn.banka.RtgsBanka")
    public void rtgsBanka(
        @WebParam(name = "mt103", targetNamespace = "")
        com.ftn.Frima.app.models.mt103.Mt103 mt103,
        @WebParam(name = "mt910", targetNamespace = "")
        com.ftn.Frima.app.models.mt910.Mt910 mt910
    );
}
