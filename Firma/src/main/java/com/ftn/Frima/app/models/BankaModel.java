package com.ftn.Frima.app.models;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "banka")
public class BankaModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "naziv")
	private String naziv;
	
	@Column(name = "adresa")
	private String adresa;
	
	@Column(name = "uri")
	private String uri;
	
	@Column(name = "swiftKod")
	private String swiftKod;
	
	@Column(name = "jibBanke")
	private String jibBanke;
	
	@ManyToOne
	private RacunModel racunBanke;
	
	

	public BankaModel() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getSwiftKod() {
		return swiftKod;
	}

	public void setSwiftKod(String swiftKod) {
		this.swiftKod = swiftKod;
	}

	public String getJibBanke() {
		return jibBanke;
	}

	public void setJibBanke(String jibBanke) {
		this.jibBanke = jibBanke;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public RacunModel getRacunBanke() {
		return racunBanke;
	}

	public void setRacunBanke(RacunModel racunBanke) {
		this.racunBanke = racunBanke;
	}

	
		
}
