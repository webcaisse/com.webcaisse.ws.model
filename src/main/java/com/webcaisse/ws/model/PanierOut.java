package com.webcaisse.ws.model;

import java.util.List;



public class PanierOut {

	private Integer qte ;
	private Float remise ;

	private List<ProduitOut> produits ;
	
	public List<ProduitOut> getProduits() {
		return produits;
	}
	public void setProduits(List<ProduitOut> produits) {
		this.produits = produits;
	}
	public Integer getQte() {
		return qte;
	}
	public void setQte(Integer qte) {
		this.qte = qte;
	}
	public Float getRemise() {
		return remise;
	}
	public void setRemise(Float remise) {
		this.remise = remise;
	}
	public PanierOut() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PanierOut(List<ProduitOut> produits, Integer qte, Float remise) {
		super();
		this.produits = produits;
		this.qte = qte;
		this.remise = remise;
	}
	
	
	
	
}
