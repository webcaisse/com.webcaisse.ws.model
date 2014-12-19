package com.webcaisse.ws.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.webcaisse.ws.model.UserOut;


@WebService
public interface AuthentificationService {
	
	@WebMethod
	public UserOut getAuthentification(String userName, String password, String codeSociete ) ;
	
	@WebMethod
	public UserOut findByUserName(String userName) ;
}
