package com.webcaisse.ws.interfaces;

import java.util.List;

import javax.jws.WebService;

import com.webcaisse.ws.model.CommandeOut;


@WebService
public interface CommandeManagerService {

	
	
	
	public List<CommandeOut> rechercherCommande(Long idSession) ;

	
}