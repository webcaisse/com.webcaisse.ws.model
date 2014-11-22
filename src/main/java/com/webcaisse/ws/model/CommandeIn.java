package com.webcaisse.ws.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Objet de cr�ation d'une commande
 * @author khaled
 *
 */
public class CommandeIn {
	
	
	private List<LigneCommandeIn> lignesCommandesIn = new ArrayList<LigneCommandeIn>();
	private Date dateCreation ;
//	private Long idSociete ;
//	private Long idUser ;
	private Long idSession ;
	//private Long idCommande ;
	
//    public Long getIdCommande() {
//		return idCommande;
//	}
//	public void setIdCommande(Long idCommande) {
//		this.idCommande = idCommande;
//	}
	private Double regCheque;
	private Double regCB;
	private Double regEspece;
	private Double regCarteFidelite;
	
	private String mode;
	
	private Double montant ;
	
	private String notes ;
	
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public Double getRegCheque() {
		return regCheque;
	}
	public void setRegCheque(Double regCheque) {
		this.regCheque = regCheque;
	}
	public Double getRegCB() {
		return regCB;
	}
	public void setRegCB(Double regCB) {
		this.regCB = regCB;
	}
	public Double getRegEspece() {
		return regEspece;
	}
	public void setRegEspece(Double regEspece) {
		this.regEspece = regEspece;
	}
	public Double getRegCarteFidelite() {
		return regCarteFidelite;
	}
	public void setRegCarteFidelite(Double regCarteFidelite) {
		this.regCarteFidelite = regCarteFidelite;
	}
	public Double getRegTicketRestau() {
		return regTicketRestau;
	}
	public void setRegTicketRestau(Double regTicketRestau) {
		this.regTicketRestau = regTicketRestau;
	}
	private Double regTicketRestau;
	
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
//	public Long getIdSociete() {
//		return idSociete;
//	}
//	public void setIdSociete(Long idSociete) {
//		this.idSociete = idSociete;
//	}
//	public Long getIdUser() {
//		return idUser;
//	}
//	public void setIdUser(Long idUser) {
//		this.idUser = idUser;
//	}
	public Long getIdSession() {
		return idSession;
	}
	public void setIdSession(Long idSession) {
		this.idSession = idSession;
	}
	
	
}

