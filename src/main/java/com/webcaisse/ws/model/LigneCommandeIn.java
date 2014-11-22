package com.webcaisse.ws.model;

public class LigneCommandeIn {

	/**
	 * tout ces champs on peut l'avoir dans l'objet Product, donc pas besoin de le lister ici
	 * en effet, il faut juste mapper les attributs de LignePanier 
	 * il s'agit simplement d'un copier coller entre 2 objets 
	 */
	
	private Long idProduit;
	
	/**
	 * on a pas besoin pour l'instant de mapper le chmps remise (à revoir)
	 */
	//private float remise ;
	
	private Integer quantite;

	/**
	 * c'est le prix finale unitaire de produit apres le remise
	 */
	private Double prix;
	
	private Double total ;
	
	


	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

//	public float getRemise() {
//		return remise;
//	}
//
//	public void setRemise(float remise) {
//		this.remise = remise;
//	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}



	
}
