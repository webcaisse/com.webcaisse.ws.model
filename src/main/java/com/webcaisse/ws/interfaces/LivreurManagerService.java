package com.webcaisse.ws.interfaces;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.webcaisse.ws.model.LivreurIn;
import com.webcaisse.ws.model.LivreurOut;


@WebService
public interface LivreurManagerService {

	@WebMethod
	public void sauvegarderLivreur(LivreurIn  livreur ) ;
	

	@WebMethod
	public List<LivreurOut> rechercherLivreur(Long idSociete) ;
	
	
	@WebMethod
	public void  affecterLivreurToCommande(Long idLivreur , Long idCommande) ;
	
}
