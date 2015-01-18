package com.webcaisse.ws.interfaces;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.webcaisse.ws.model.ClientIn;
import com.webcaisse.ws.model.ClientOut;
import com.webcaisse.ws.model.FamilleIn;
import com.webcaisse.ws.model.ProduitOut;


@WebService
public interface ClientManagerService {
	
	
	@WebMethod
	public List<ClientOut> rechercherClient(Long idSociete) ;
	
	 @WebMethod 
	public void ajouterClient(ClientIn c) ;
	 
	 @WebMethod
   public void supprimerClient(Long idClient);
	 
	 @WebMethod 
  public void updateClient(ClientIn c) ;
	 
	 @WebMethod 
  public ClientOut loadClientById(Long IdClient) ;
	 
	 @WebMethod 
   public List<ClientOut> autoCompleteClient(String param) ;
	
}
