package com.ftn.Frima.app.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fakturaStavka")
public class FakturaStavkaModel implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "redniBroj")
	private Integer redniBroj;
	
	@Column(name = "naziv")
	private String naziv;
	
	@Column(name = "kolicina")
	private BigDecimal kolicina;
	
	@Column(name = "jedinicaMere")
	private String jedinicaMere;

	@Column(name = "jedinicnaCena")
	private BigDecimal jedinicnaCena;
	
	@Column(name = "vrednost")
	private BigDecimal vrednost;
	
	@Column(name = "procenatRabata")
	private BigDecimal procenatRabata;
	
	@Column(name = "iznosRabata")
	private BigDecimal iznosRabata;
	
	@Column(name = "umanjenoZaRabat")
	private BigDecimal umanjenoZaRabat;
	
	@Column(name = "ukupanPorez")
	private BigDecimal ukupanPorez;
	
	@ManyToOne
	private FakturaModel faktura;
	
	public FakturaStavkaModel() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRedniBroj() {
		return redniBroj;
	}

	public void setRedniBroj(Integer redniBroj) {
		this.redniBroj = redniBroj;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public BigDecimal getKolicina() {
		return kolicina;
	}

	public void setKolicina(BigDecimal kolicina) {
		this.kolicina = kolicina;
	}

	public String getJedinicaMere() {
		return jedinicaMere;
	}

	public void setJedinicaMere(String jedinicaMere) {
		this.jedinicaMere = jedinicaMere;
	}

	public BigDecimal getJedinicnaCena() {
		return jedinicnaCena;
	}

	public void setJedinicnaCena(BigDecimal jedinicnaCena) {
		this.jedinicnaCena = jedinicnaCena;
	}

	public BigDecimal getVrednost() {
		return vrednost;
	}

	public void setVrednost(BigDecimal vrednost) {
		this.vrednost = vrednost;
	}

	public BigDecimal getProcenatRabata() {
		return procenatRabata;
	}

	public void setProcenatRabata(BigDecimal procenatRabata) {
		this.procenatRabata = procenatRabata;
	}

	public BigDecimal getIznosRabata() {
		return iznosRabata;
	}

	public void setIznosRabata(BigDecimal iznosRabata) {
		this.iznosRabata = iznosRabata;
	}

	public BigDecimal getUmanjenoZaRabat() {
		return umanjenoZaRabat;
	}

	public void setUmanjenoZaRabat(BigDecimal umanjenoZaRabat) {
		this.umanjenoZaRabat = umanjenoZaRabat;
	}

	public BigDecimal getUkupanPorez() {
		return ukupanPorez;
	}

	public void setUkupanPorez(BigDecimal ukupanPorez) {
		this.ukupanPorez = ukupanPorez;
	}

	public FakturaModel getFaktura() {
		return faktura;
	}

	public void setFaktura(FakturaModel faktura) {
		this.faktura = faktura;
	}

}