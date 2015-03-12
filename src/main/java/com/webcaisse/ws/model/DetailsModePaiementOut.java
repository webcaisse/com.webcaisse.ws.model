package com.webcaisse.ws.model;

import java.io.Serializable;

public class DetailsModePaiementOut implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8374709627727602940L;

	private String libelleModePaiement;
	
	private Double montantModePaiement;
	
	
	public DetailsModePaiementOut() {
		super();
	}

	public DetailsModePaiementOut(String libelleModePaiement,
			Double montantModePaiement) {
		super();
		this.libelleModePaiement = libelleModePaiement;
		this.montantModePaiement = montantModePaiement;
	}

	public String getLibelleModePaiement() {
		return libelleModePaiement;
	}

	public void setLibelleModePaiement(String libelleModePaiement) {
		this.libelleModePaiement = libelleModePaiement;
	}

	public Double getMontantModePaiement() {
		return montantModePaiement;
	}

	public void setMontantModePaiement(Double montantModePaiement) {
		this.montantModePaiement = montantModePaiement;
	}
	
	
}
