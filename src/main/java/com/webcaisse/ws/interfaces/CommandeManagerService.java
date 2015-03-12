package com.webcaisse.ws.interfaces;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.webcaisse.ws.model.CommandeOut;


@WebService
public interface CommandeManagerService {

	
	@WebMethod
	public List<CommandeOut> rechercherCommande(Long idSession) ;
	
	@WebMethod
	public List<CommandeOut> rechercherCommandeParDate(Long idSociete, Date dateCommande) ;
	
	@WebMethod
	public CommandeOut  loadCommandeById( Long idCommande) ;
	
	@WebMethod
	public List<CommandeOut>  getCommandesByIdLivreur(Long idLivreur) ;

	
	@WebMethod
	public List<CommandeOut>  getCommandesByEtat(String etatCommande) ;
	
	@WebMethod
	public void affecterEtatToCommandeAvecMode(String etatCommande ,Long idCommande,String modeCommande) ;
	
	@WebMethod
	public void affecterEtatToCommande(String etatCommande ,Long idCommande) ;
	
}
