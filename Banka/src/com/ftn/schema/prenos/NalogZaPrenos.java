
package com.ftn.schema.prenos;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id-poruke" type="{http://www.ftn.com/schema/prenos}TID"/>
 *         &lt;element name="duznik-nalogodavac" type="{http://www.ftn.com/schema/prenos}TString255"/>
 *         &lt;element name="svrha-placanja" type="{http://www.ftn.com/schema/prenos}TString255"/>
 *         &lt;element name="primalac-poverilac" type="{http://www.ftn.com/schema/prenos}TString255"/>
 *         &lt;element name="datum-naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="podaci-o-prenosu">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="oznaka-valute" type="{http://www.ftn.com/schema/prenos}TSifraValute"/>
 *                   &lt;element name="iznos" type="{http://www.ftn.com/schema/prenos}TDecimal_15_2"/>
 *                   &lt;element name="datum-valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="duznik-prenos" type="{http://www.ftn.com/schema/prenos}TOsobaPrenos"/>
 *                   &lt;element name="poverilac-prenos" type="{http://www.ftn.com/schema/prenos}TOsobaPrenos"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attribute name="hitno" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "nalog-za-prenos")
public class NalogZaPrenos {

    @XmlElement(name = "id-poruke", required = true)
    protected String idPoruke;
    @XmlElement(name = "duznik-nalogodavac", required = true)
    protected String duznikNalogodavac;
    @XmlElement(name = "svrha-placanja", required = true)
    protected String svrhaPlacanja;
    @XmlElement(name = "primalac-poverilac", required = true)
    protected String primalacPoverilac;
    @XmlElement(name = "datum-naloga", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumNaloga;
    @XmlElement(name = "podaci-o-prenosu", required = true)
    protected NalogZaPrenos.PodaciOPrenosu podaciOPrenosu;
    @XmlAttribute(name = "hitno")
    protected Boolean hitno;

    /**
     * Gets the value of the idPoruke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPoruke() {
        return idPoruke;
    }

    /**
     * Sets the value of the idPoruke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPoruke(String value) {
        this.idPoruke = value;
    }

    /**
     * Gets the value of the duznikNalogodavac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuznikNalogodavac() {
        return duznikNalogodavac;
    }

    /**
     * Sets the value of the duznikNalogodavac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuznikNalogodavac(String value) {
        this.duznikNalogodavac = value;
    }

    /**
     * Gets the value of the svrhaPlacanja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvrhaPlacanja() {
        return svrhaPlacanja;
    }

    /**
     * Sets the value of the svrhaPlacanja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvrhaPlacanja(String value) {
        this.svrhaPlacanja = value;
    }

    /**
     * Gets the value of the primalacPoverilac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimalacPoverilac() {
        return primalacPoverilac;
    }

    /**
     * Sets the value of the primalacPoverilac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimalacPoverilac(String value) {
        this.primalacPoverilac = value;
    }

    /**
     * Gets the value of the datumNaloga property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumNaloga() {
        return datumNaloga;
    }

    /**
     * Sets the value of the datumNaloga property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumNaloga(XMLGregorianCalendar value) {
        this.datumNaloga = value;
    }

    /**
     * Gets the value of the podaciOPrenosu property.
     * 
     * @return
     *     possible object is
     *     {@link NalogZaPrenos.PodaciOPrenosu }
     *     
     */
    public NalogZaPrenos.PodaciOPrenosu getPodaciOPrenosu() {
        return podaciOPrenosu;
    }

    /**
     * Sets the value of the podaciOPrenosu property.
     * 
     * @param value
     *     allowed object is
     *     {@link NalogZaPrenos.PodaciOPrenosu }
     *     
     */
    public void setPodaciOPrenosu(NalogZaPrenos.PodaciOPrenosu value) {
        this.podaciOPrenosu = value;
    }

    /**
     * Gets the value of the hitno property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHitno() {
        if (hitno == null) {
            return false;
        } else {
            return hitno;
        }
    }

    /**
     * Sets the value of the hitno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHitno(Boolean value) {
        this.hitno = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="oznaka-valute" type="{http://www.ftn.com/schema/prenos}TSifraValute"/>
     *         &lt;element name="iznos" type="{http://www.ftn.com/schema/prenos}TDecimal_15_2"/>
     *         &lt;element name="datum-valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="duznik-prenos" type="{http://www.ftn.com/schema/prenos}TOsobaPrenos"/>
     *         &lt;element name="poverilac-prenos" type="{http://www.ftn.com/schema/prenos}TOsobaPrenos"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class PodaciOPrenosu {

        @XmlElement(name = "oznaka-valute", required = true)
        protected String oznakaValute;
        @XmlElement(required = true)
        protected BigDecimal iznos;
        @XmlElement(name = "datum-valute", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumValute;
        @XmlElement(name = "duznik-prenos", required = true)
        protected TOsobaPrenos duznikPrenos;
        @XmlElement(name = "poverilac-prenos", required = true)
        protected TOsobaPrenos poverilacPrenos;

        /**
         * Gets the value of the oznakaValute property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOznakaValute() {
            return oznakaValute;
        }

        /**
         * Sets the value of the oznakaValute property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOznakaValute(String value) {
            this.oznakaValute = value;
        }

        /**
         * Gets the value of the iznos property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getIznos() {
            return iznos;
        }

        /**
         * Sets the value of the iznos property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setIznos(BigDecimal value) {
            this.iznos = value;
        }

        /**
         * Gets the value of the datumValute property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDatumValute() {
            return datumValute;
        }

        /**
         * Sets the value of the datumValute property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDatumValute(XMLGregorianCalendar value) {
            this.datumValute = value;
        }

        /**
         * Gets the value of the duznikPrenos property.
         * 
         * @return
         *     possible object is
         *     {@link TOsobaPrenos }
         *     
         */
        public TOsobaPrenos getDuznikPrenos() {
            return duznikPrenos;
        }

        /**
         * Sets the value of the duznikPrenos property.
         * 
         * @param value
         *     allowed object is
         *     {@link TOsobaPrenos }
         *     
         */
        public void setDuznikPrenos(TOsobaPrenos value) {
            this.duznikPrenos = value;
        }

        /**
         * Gets the value of the poverilacPrenos property.
         * 
         * @return
         *     possible object is
         *     {@link TOsobaPrenos }
         *     
         */
        public TOsobaPrenos getPoverilacPrenos() {
            return poverilacPrenos;
        }

        /**
         * Sets the value of the poverilacPrenos property.
         * 
         * @param value
         *     allowed object is
         *     {@link TOsobaPrenos }
         *     
         */
        public void setPoverilacPrenos(TOsobaPrenos value) {
            this.poverilacPrenos = value;
        }

    }

}
