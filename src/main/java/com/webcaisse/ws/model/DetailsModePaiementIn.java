package com.webcaisse.ws.model;

import java.io.Serializable;
import java.util.Date;

public class DetailsModePaiementIn implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3247799455287983096L;
	
	private Date dateDebutStats;
	
	private Date dateFinStats;
	
	private Long idSociete;
	
	

	public Date getDateDebutStats() {
		return dateDebutStats;
	}

	public void setDateDebutStats(Date dateDebutStats) {
		this.dateDebutStats = dateDebutStats;
	}

	public Date getDateFinStats() {
		return dateFinStats;
	}

	public void setDateFinStats(Date dateFinStats) {
		this.dateFinStats = dateFinStats;
	}

	public Long getIdSociete() {
		return idSociete;
	}

	public void setIdSociete(Long idSociete) {
		this.idSociete = idSociete;
	}
	
}
