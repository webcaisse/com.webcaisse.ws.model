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

	
}
