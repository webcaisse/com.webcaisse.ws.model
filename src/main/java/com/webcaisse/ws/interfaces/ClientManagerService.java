package com.webcaisse.ws.interfaces;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.webcaisse.ws.model.ClientOut;


@WebService
public interface ClientManagerService {
	
	
	@WebMethod
	public List<ClientOut> rechercherClient(Long idSociete) ;
	
}
