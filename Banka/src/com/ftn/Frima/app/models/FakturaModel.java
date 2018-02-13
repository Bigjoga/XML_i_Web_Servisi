package com.ftn.Frima.app.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "faktura")
public class FakturaModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nazivDobavljaca")
	private String nazivDobavljaca;
	
	@Column(name = "adresaDobavljaca")
	private String adresaDobavljaca;
	
	@Column(name = "pibDobavljaca")
	private String pibDobavljaca;
	
	@Column(name = "nazivKupca")
	private String nazivKupca;
	
	@Column(name = "adresaKupca")
	private String adresaKupca;
	
	@Column(name = "pibKupca")
	private String pibKupca;
	
	@Column(name = "brojRacuna")
	private String brojRacuna;
	
	@Column(name = "datumRacuna")
	private Date datumRacuna;
	
	@Column(name = "vrednostRobe")
	private BigDecimal vrednostRobe;
	
	@Column(name = "vrednostUsluga")
	private BigDecimal vrednostUsluga;
	
	@Column(name = "ukupnoRobaIUsluge")
	private BigDecimal ukupnoRobaIUsluge;
	
	@Column(name = "ukupnoRabat")
	private BigDecimal ukupnoRabat;
	
	@Column(name = "ukupnoPorez")
	private BigDecimal ukupnoPorez;
	
	@Column(name = "oznakaValute")
	private String oznakaValute;
	
	@Column(name = "iznosZaUplatu")
	private BigDecimal iznosZaUplatu;
	
	@Column(name = "uplataNaRacun")
	private String uplataNaRacun;
	
	@Column(name = "datumValute")
	private Date datumValute;

	@OneToMany(mappedBy = "faktura", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Collection<FakturaStavkaModel> stavke;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNazivDobavljaca() {
		return nazivDobavljaca;
	}

	public void setNazivDobavljaca(String nazivDobavljaca) {
		this.nazivDobavljaca = nazivDobavljaca;
	}

	public String getAdresaDobavljaca() {
		return adresaDobavljaca;
	}

	public void setAdresaDobavljaca(String adresaDobavljaca) {
		this.adresaDobavljaca = adresaDobavljaca;
	}

	public String getPibDobavljaca() {
		return pibDobavljaca;
	}

	public void setPibDobavljaca(String pibDobavljaca) {
		this.pibDobavljaca = pibDobavljaca;
	}

	public String getNazivKupca() {
		return nazivKupca;
	}

	public void setNazivKupca(String nazivKupca) {
		this.nazivKupca = nazivKupca;
	}

	public String getAdresaKupca() {
		return adresaKupca;
	}

	public void setAdresaKupca(String adresaKupca) {
		this.adresaKupca = adresaKupca;
	}

	public String getPibKupca() {
		return pibKupca;
	}

	public void setPibKupca(String pibKupca) {
		this.pibKupca = pibKupca;
	}

	public String getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public Date getDatumRacuna() {
		return datumRacuna;
	}

	public void setDatumRacuna(Date datumRacuna) {
		this.datumRacuna = datumRacuna;
	}

	public BigDecimal getVrednostRobe() {
		return vrednostRobe;
	}

	public void setVrednostRobe(BigDecimal vrednostRobe) {
		this.vrednostRobe = vrednostRobe;
	}

	public BigDecimal getVrednostUsluga() {
		return vrednostUsluga;
	}

	public void setVrednostUsluga(BigDecimal vrednostUsluga) {
		this.vrednostUsluga = vrednostUsluga;
	}

	public BigDecimal getUkupnoRobaIUsluge() {
		return ukupnoRobaIUsluge;
	}

	public void setUkupnoRobaIUsluge(BigDecimal ukupnoRobaIUsluge) {
		this.ukupnoRobaIUsluge = ukupnoRobaIUsluge;
	}

	public BigDecimal getUkupnoRabat() {
		return ukupnoRabat;
	}

	public void setUkupnoRabat(BigDecimal ukupnoRabat) {
		this.ukupnoRabat = ukupnoRabat;
	}

	public BigDecimal getUkupnoPorez() {
		return ukupnoPorez;
	}

	public void setUkupnoPorez(BigDecimal ukupnoPorez) {
		this.ukupnoPorez = ukupnoPorez;
	}

	public String getOznakaValute() {
		return oznakaValute;
	}

	public void setOznakaValute(String oznakaValute) {
		this.oznakaValute = oznakaValute;
	}

	public BigDecimal getIznosZaUplatu() {
		return iznosZaUplatu;
	}

	public void setIznosZaUplatu(BigDecimal iznosZaUplatu) {
		this.iznosZaUplatu = iznosZaUplatu;
	}

	public String getUplataNaRacun() {
		return uplataNaRacun;
	}

	public void setUplataNaRacun(String uplataNaRacun) {
		this.uplataNaRacun = uplataNaRacun;
	}

	public Date getDatumValute() {
		return datumValute;
	}

	public void setDatumValute(Date datumValute) {
		this.datumValute = datumValute;
	}
	
}
