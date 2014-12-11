package com.webcaisse.ws.model;

import java.util.List;

public class ProduitIn {
	
	
	private String libelle ;
	private String code ;
	private List<Double> prix;

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
	
}
