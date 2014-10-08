package com.webcaisse.ws.model;

import java.util.List;



    public class ProduitOut {
	
    private String libelle;
	private String description;
	
	private List<PrixOut> prix ;
	
	private Integer qteStock;
	
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Integer getQteStock() {
		return qteStock;
	}

	public void setQteStock(Integer qteStock) {
		this.qteStock = qteStock;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
//
//	public Double getPrix() {
//		return prix;
//	}
//
//	public void setPrix(Double prix) {
//		this.prix = prix;
//	}

	public List<PrixOut> getPrix() {
		return prix;
		}

	public void setPrix(List<PrixOut> prix) {
		this.prix = prix;
	}



}
