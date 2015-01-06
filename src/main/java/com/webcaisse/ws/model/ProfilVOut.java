package com.webcaisse.ws.model;

public class ProfilVOut {

	
	private Integer id;
	
	private String libelle;

	public ProfilVOut() {
		super();
	}


	public ProfilVOut(Integer id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
