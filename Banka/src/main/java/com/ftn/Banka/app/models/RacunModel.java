package com.ftn.Banka.app.models;

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
@Table(name = "racun")
public class RacunModel implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "brojRacuna")
	private String brojRacuna;
	
	@Column(name = "trenutnoStanje")
	private BigDecimal trenutnoStanje;
	
	@Column(name = "rezervisanaSredstva")
	private BigDecimal rezervisanaSredstva;

	@ManyToOne
	private BankaModel banka;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public BigDecimal getTrenutnoStanje() {
		return trenutnoStanje;
	}

	public void setTrenutnoStanje(BigDecimal trenutnoStanje) {
		this.trenutnoStanje = trenutnoStanje;
	}

	public BigDecimal getRezervisanaSredstva() {
		return rezervisanaSredstva;
	}

	public void setRezervisanaSredstva(BigDecimal rezervisanaSredstva) {
		this.rezervisanaSredstva = rezervisanaSredstva;
	}
		
}
