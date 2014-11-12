package com.webcaisse.ws.model;

import java.util.List;

public class ProduitOut {

	private String libelle;
	private String description;
	private List<PrixOut> prixOut;
	private Integer qteStock;
	private Long id;
	private String couleur ;

	
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public List<PrixOut> getPrixOut() {
		return prixOut;
	}

	public void setPrixOut(List<PrixOut> prixOut) {
		this.prixOut = prixOut;
	}

}
