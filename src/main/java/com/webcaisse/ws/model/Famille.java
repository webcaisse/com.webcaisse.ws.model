package com.webcaisse.ws.model;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Famille {

	private String libelle;

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
