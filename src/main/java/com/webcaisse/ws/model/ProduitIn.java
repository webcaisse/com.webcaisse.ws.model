package com.webcaisse.ws.model;

import java.util.List;

public class ProduitIn {
	
	
	private Long id  ;
	private String libelle ;
	private String code ;
	private List<Double> prix;
	private Long familleId;

	public Long getFamilleId() {
		return familleId;
	}
	public void setFamilleId(Long familleId) {
		this.familleId = familleId;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<Double> getPrix() {
		return prix;
	}
	public void setPrix(List<Double> prix) {
		this.prix = prix;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
