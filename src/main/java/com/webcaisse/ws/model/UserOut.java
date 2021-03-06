package com.webcaisse.ws.model;

public class UserOut {

	private Long id;
	
	private String nom;
	
	private String prenom;
	
	private String adresse;
	
	private String nomSociete;
	
	private Long societeId;
	
	private String username ;
	
	private String telephone ;
	private String password ;

	public String getUsername() {
		return username;
	}

	
	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getNomSociete() {
		return nomSociete;
	}

	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSocieteId() {
		return societeId;
	}

	public void setSocieteId(Long societeId) {
		this.societeId = societeId;
	}
	
}
