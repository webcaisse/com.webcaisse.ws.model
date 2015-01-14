package com.webcaisse.ws.model;

public class LivreurIn {
	
	private Long id  ;
	
    private String nom;
	
	private String prenom;
	
	private String adresse;
	
	private String telephone ;
	
	private Long societeId;
	private String nss;
	

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Long getSocieteId() {
		return societeId;
	}

	public void setSocieteId(Long societeId) {
		this.societeId = societeId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
