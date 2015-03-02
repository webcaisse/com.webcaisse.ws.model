package com.webcaisse.ws.model;

import java.util.Date;

public class ParametreIn {

    private Long idSociete;
	
	private Date dateCrea;
	
	private Date dateModif;
	
	private String valeur ;
	
	private String nomParametre;
	
	public Long getIdSociete() {
		return idSociete;
	}

	public void setIdSociete(Long idSociete) {
		this.idSociete = idSociete;
	}

	public Date getDateCrea() {
		return dateCrea;
	}

	public void setDateCrea(Date dateCrea) {
		this.dateCrea = dateCrea;
	}

	public Date getDateModif() {
		return dateModif;
	}

	public void setDateModif(Date dateModif) {
		this.dateModif = dateModif;
	}

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	public String getNomParametre() {
		return nomParametre;
	}

	public void setNomParametre(String nomParametre) {
		this.nomParametre = nomParametre;
	}

	
}
