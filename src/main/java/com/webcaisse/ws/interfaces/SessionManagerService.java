package com.webcaisse.ws.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.webcaisse.ws.model.SessionOut;


@WebService
public interface SessionManagerService {

	
	@WebMethod
	public Long ouvrirSession(Long idUser) ;
	
	
	@WebMethod
	public void fermerSession(Long idSession) ;

	
}
