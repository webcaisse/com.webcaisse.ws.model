package com.webcaisse.ws.model;

public class EtatCommandeIn {

	
	private String libelle ;
	private Long societeId;
	private String code ;
	
	
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Long getSocieteId() {
		return societeId;
	}

	public void setSocieteId(Long societeId) {
		this.societeId = societeId;
	}
	
	
	
	
	
}
