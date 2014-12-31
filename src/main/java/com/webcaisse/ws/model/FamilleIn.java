package com.webcaisse.ws.model;

public class FamilleIn {

	private String libelle ;
	private String color  ;
	private Long idSociete ;
	private Long id ;
	
	
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Long getIdSociete() {
		return idSociete;
	}
	public void setIdSociete(Long idSociete) {
		this.idSociete = idSociete;
	}
	
	
}
