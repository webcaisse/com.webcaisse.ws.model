package com.webcaisse.ws.model;

import java.util.Date;
import java.util.List;

public class CommandeOut {

	
	private Date dateCommande;
	private String etat ;
	private String libelleProduit ;
	private String mode ;
	private Integer quantite;
	private Long id ;
	private String nomLivreur ;
	
	private List<LigneCommandeOut >ligneCommandeOut ;
	

	
	
	

	public String getNomLivreur() {
		return nomLivreur;
	}

	public void setNomLivreur(String nomLivreur) {
		this.nomLivreur = nomLivreur;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<LigneCommandeOut> getLigneCommandeOut() {
		return ligneCommandeOut;
	}

	public void setLigneCommandeOut(List<LigneCommandeOut> ligneCommandeOut) {
		this.ligneCommandeOut = ligneCommandeOut;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getLibelleProduit() {
		return libelleProduit;
	}

	public void setLibelleProduit(String libelleProduit) {
		this.libelleProduit = libelleProduit;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
}
