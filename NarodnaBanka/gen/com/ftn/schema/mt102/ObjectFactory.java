
package com.ftn.schema.mt102;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ftn.schema.mt102 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ftn.schema.mt102
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Mt102 }
     * 
     */
    public Mt102 createMt102() {
        return new Mt102();
    }

    /**
     * Create an instance of {@link TBanka }
     * 
     */
    public TBanka createTBanka() {
        return new TBanka();
    }

    /**
     * Create an instance of {@link Mt102 .PojedinacnaPlacanja }
     * 
     */
    public Mt102 .PojedinacnaPlacanja createMt102PojedinacnaPlacanja() {
        return new Mt102 .PojedinacnaPlacanja();
    }

    /**
     * Create an instance of {@link TPojedinacnoPlacanje }
     * 
     */
    public TPojedinacnoPlacanje createTPojedinacnoPlacanje() {
        return new TPojedinacnoPlacanje();
    }

}
