package com.webcaisse.ws.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Objet de création d'une commande
 * @author khaled
 *
 */
public class CommandeIn {
	
	
	private List<LigneCommandeIn> lignesCommandesIn = new ArrayList<LigneCommandeIn>();
	private Date dateCreation ;
	private Long idSociete ;
	private Long idUser ;
	
	public List<LigneCommandeIn> getLignesCommandesIn() {
		return lignesCommandesIn;
	}
	public void setLignesCommandesIn(List<LigneCommandeIn> lignesCommandesIn) {
		this.lignesCommandesIn = lignesCommandesIn;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Long getIdSociete() {
		return idSociete;
	}
	public void setIdSociete(Long idSociete) {
		this.idSociete = idSociete;
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	
	
}

