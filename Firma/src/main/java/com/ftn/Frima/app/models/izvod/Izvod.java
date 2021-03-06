
package com.ftn.Frima.app.models.izvod;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;sequence>
 *         &lt;element name="zaglavlje">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="broj-racuna" type="{http://www.ftn.com/schema/izvod}TBrojRacunaBanke"/>
 *                   &lt;element name="datum-naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="broj-preseka" type="{http://www.ftn.com/schema/izvod}TBrojPreseka"/>
 *                   &lt;element name="prethodno-stanje" type="{http://www.ftn.com/schema/izvod}TDecimal_15_2"/>
 *                   &lt;element name="broj-promena-u-korist" type="{http://www.ftn.com/schema/izvod}TNumber6"/>
 *                   &lt;element name="ukupno-u-korist" type="{http://www.ftn.com/schema/izvod}TDecimal_15_2"/>
 *                   &lt;element name="broj-promena-na-teret" type="{http://www.ftn.com/schema/izvod}TNumber6"/>
 *                   &lt;element name="ukupno-na-teret" type="{http://www.ftn.com/schema/izvod}TDecimal_15_2"/>
 *                   &lt;element name="novo-stanje" type="{http://www.ftn.com/schema/izvod}TDecimal_15_2"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="presek">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="stavka-preseka" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="duznik-nalogodavac" type="{http://www.ftn.com/schema/izvod}TString255"/>
 *                             &lt;element name="svrha-placanja" type="{http://www.ftn.com/schema/izvod}TString255"/>
 *                             &lt;element name="primalac-poverilac" type="{http://www.ftn.com/schema/izvod}TString255"/>
 *                             &lt;element name="datum-naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="podaci-o-prenosu">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="iznos" type="{http://www.ftn.com/schema/izvod}TDecimal_15_2"/>
 *                                       &lt;element name="datum-valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="duznik-prenos" type="{http://www.ftn.com/schema/izvod}TOsobaPrenos"/>
 *                                       &lt;element name="poverilac-prenos" type="{http://www.ftn.com/schema/izvod}TOsobaPrenos"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="smer">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "zaglavlje",
    "presek"
})
@XmlRootElement(name = "izvod")
public class Izvod {

    @XmlElement(required = true)
    protected Izvod.Zaglavlje zaglavlje;
    @XmlElement(required = true)
    protected Izvod.Presek presek;

    /**
     * Gets the value of the zaglavlje property.
     * 
     * @return
     *     possible object is
     *     {@link Izvod.Zaglavlje }
     *     
     */
    public Izvod.Zaglavlje getZaglavlje() {
        return zaglavlje;
    }

    /**
     * Sets the value of the zaglavlje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Izvod.Zaglavlje }
     *     
     */
    public void setZaglavlje(Izvod.Zaglavlje value) {
        this.zaglavlje = value;
    }

    /**
     * Gets the value of the presek property.
     * 
     * @return
     *     possible object is
     *     {@link Izvod.Presek }
     *     
     */
    public Izvod.Presek getPresek() {
        return presek;
    }

    /**
     * Sets the value of the presek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Izvod.Presek }
     *     
     */
    public void setPresek(Izvod.Presek value) {
        this.presek = value;
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
     *       &lt;sequence>
     *         &lt;element name="stavka-preseka" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="duznik-nalogodavac" type="{http://www.ftn.com/schema/izvod}TString255"/>
     *                   &lt;element name="svrha-placanja" type="{http://www.ftn.com/schema/izvod}TString255"/>
     *                   &lt;element name="primalac-poverilac" type="{http://www.ftn.com/schema/izvod}TString255"/>
     *                   &lt;element name="datum-naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="podaci-o-prenosu">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="iznos" type="{http://www.ftn.com/schema/izvod}TDecimal_15_2"/>
     *                             &lt;element name="datum-valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="duznik-prenos" type="{http://www.ftn.com/schema/izvod}TOsobaPrenos"/>
     *                             &lt;element name="poverilac-prenos" type="{http://www.ftn.com/schema/izvod}TOsobaPrenos"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="smer">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "stavkaPreseka"
    })
    public static class Presek {

        @XmlElement(name = "stavka-preseka")
        protected List<Izvod.Presek.StavkaPreseka> stavkaPreseka;

        /**
         * Gets the value of the stavkaPreseka property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stavkaPreseka property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStavkaPreseka().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Izvod.Presek.StavkaPreseka }
         * 
         * 
         */
        public List<Izvod.Presek.StavkaPreseka> getStavkaPreseka() {
            if (stavkaPreseka == null) {
                stavkaPreseka = new ArrayList<Izvod.Presek.StavkaPreseka>();
            }
            return this.stavkaPreseka;
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
         *         &lt;element name="duznik-nalogodavac" type="{http://www.ftn.com/schema/izvod}TString255"/>
         *         &lt;element name="svrha-placanja" type="{http://www.ftn.com/schema/izvod}TString255"/>
         *         &lt;element name="primalac-poverilac" type="{http://www.ftn.com/schema/izvod}TString255"/>
         *         &lt;element name="datum-naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="podaci-o-prenosu">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="iznos" type="{http://www.ftn.com/schema/izvod}TDecimal_15_2"/>
         *                   &lt;element name="datum-valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="duznik-prenos" type="{http://www.ftn.com/schema/izvod}TOsobaPrenos"/>
         *                   &lt;element name="poverilac-prenos" type="{http://www.ftn.com/schema/izvod}TOsobaPrenos"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="smer">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
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
        public static class StavkaPreseka {

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
            protected Izvod.Presek.StavkaPreseka.PodaciOPrenosu podaciOPrenosu;
            @XmlElement(required = true)
            protected String smer;

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
             *     {@link Izvod.Presek.StavkaPreseka.PodaciOPrenosu }
             *     
             */
            public Izvod.Presek.StavkaPreseka.PodaciOPrenosu getPodaciOPrenosu() {
                return podaciOPrenosu;
            }

            /**
             * Sets the value of the podaciOPrenosu property.
             * 
             * @param value
             *     allowed object is
             *     {@link Izvod.Presek.StavkaPreseka.PodaciOPrenosu }
             *     
             */
            public void setPodaciOPrenosu(Izvod.Presek.StavkaPreseka.PodaciOPrenosu value) {
                this.podaciOPrenosu = value;
            }

            /**
             * Gets the value of the smer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSmer() {
                return smer;
            }

            /**
             * Sets the value of the smer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSmer(String value) {
                this.smer = value;
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
             *         &lt;element name="iznos" type="{http://www.ftn.com/schema/izvod}TDecimal_15_2"/>
             *         &lt;element name="datum-valute" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="duznik-prenos" type="{http://www.ftn.com/schema/izvod}TOsobaPrenos"/>
             *         &lt;element name="poverilac-prenos" type="{http://www.ftn.com/schema/izvod}TOsobaPrenos"/>
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
     *         &lt;element name="broj-racuna" type="{http://www.ftn.com/schema/izvod}TBrojRacunaBanke"/>
     *         &lt;element name="datum-naloga" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="broj-preseka" type="{http://www.ftn.com/schema/izvod}TBrojPreseka"/>
     *         &lt;element name="prethodno-stanje" type="{http://www.ftn.com/schema/izvod}TDecimal_15_2"/>
     *         &lt;element name="broj-promena-u-korist" type="{http://www.ftn.com/schema/izvod}TNumber6"/>
     *         &lt;element name="ukupno-u-korist" type="{http://www.ftn.com/schema/izvod}TDecimal_15_2"/>
     *         &lt;element name="broj-promena-na-teret" type="{http://www.ftn.com/schema/izvod}TNumber6"/>
     *         &lt;element name="ukupno-na-teret" type="{http://www.ftn.com/schema/izvod}TDecimal_15_2"/>
     *         &lt;element name="novo-stanje" type="{http://www.ftn.com/schema/izvod}TDecimal_15_2"/>
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
    public static class Zaglavlje {

        @XmlElement(name = "broj-racuna", required = true)
        protected String brojRacuna;
        @XmlElement(name = "datum-naloga", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumNaloga;
        @XmlElement(name = "broj-preseka")
        protected long brojPreseka;
        @XmlElement(name = "prethodno-stanje", required = true)
        protected BigDecimal prethodnoStanje;
        @XmlElement(name = "broj-promena-u-korist")
        protected int brojPromenaUKorist;
        @XmlElement(name = "ukupno-u-korist", required = true)
        protected BigDecimal ukupnoUKorist;
        @XmlElement(name = "broj-promena-na-teret")
        protected int brojPromenaNaTeret;
        @XmlElement(name = "ukupno-na-teret", required = true)
        protected BigDecimal ukupnoNaTeret;
        @XmlElement(name = "novo-stanje", required = true)
        protected BigDecimal novoStanje;

        /**
         * Gets the value of the brojRacuna property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrojRacuna() {
            return brojRacuna;
        }

        /**
         * Sets the value of the brojRacuna property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrojRacuna(String value) {
            this.brojRacuna = value;
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
         * Gets the value of the brojPreseka property.
         * 
         */
        public long getBrojPreseka() {
            return brojPreseka;
        }

        /**
         * Sets the value of the brojPreseka property.
         * 
         */
        public void setBrojPreseka(long value) {
            this.brojPreseka = value;
        }

        /**
         * Gets the value of the prethodnoStanje property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPrethodnoStanje() {
            return prethodnoStanje;
        }

        /**
         * Sets the value of the prethodnoStanje property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPrethodnoStanje(BigDecimal value) {
            this.prethodnoStanje = value;
        }

        /**
         * Gets the value of the brojPromenaUKorist property.
         * 
         */
        public int getBrojPromenaUKorist() {
            return brojPromenaUKorist;
        }

        /**
         * Sets the value of the brojPromenaUKorist property.
         * 
         */
        public void setBrojPromenaUKorist(int value) {
            this.brojPromenaUKorist = value;
        }

        /**
         * Gets the value of the ukupnoUKorist property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUkupnoUKorist() {
            return ukupnoUKorist;
        }

        /**
         * Sets the value of the ukupnoUKorist property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUkupnoUKorist(BigDecimal value) {
            this.ukupnoUKorist = value;
        }

        /**
         * Gets the value of the brojPromenaNaTeret property.
         * 
         */
        public int getBrojPromenaNaTeret() {
            return brojPromenaNaTeret;
        }

        /**
         * Sets the value of the brojPromenaNaTeret property.
         * 
         */
        public void setBrojPromenaNaTeret(int value) {
            this.brojPromenaNaTeret = value;
        }

        /**
         * Gets the value of the ukupnoNaTeret property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUkupnoNaTeret() {
            return ukupnoNaTeret;
        }

        /**
         * Sets the value of the ukupnoNaTeret property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUkupnoNaTeret(BigDecimal value) {
            this.ukupnoNaTeret = value;
        }

        /**
         * Gets the value of the novoStanje property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNovoStanje() {
            return novoStanje;
        }

        /**
         * Sets the value of the novoStanje property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNovoStanje(BigDecimal value) {
            this.novoStanje = value;
        }

    }

}
