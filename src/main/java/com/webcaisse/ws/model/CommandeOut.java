package com.webcaisse.ws.model;

import java.util.Date;

public class CommandeOut {

	
	private Date dateCommande;
	private String etat ;

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
