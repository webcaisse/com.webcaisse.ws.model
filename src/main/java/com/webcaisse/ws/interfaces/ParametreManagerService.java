package com.webcaisse.ws.interfaces;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.webcaisse.ws.model.ClientOut;
import com.webcaisse.ws.model.ParametreIn;
import com.webcaisse.ws.model.UserIn;
import com.webcaisse.ws.model.UserOut;

@WebService
public interface ParametreManagerService {
	
	
	@WebMethod
	public void sauvegarderParametre(ParametreIn parametre ) ;
	
	@WebMethod
	public void sauvegarderUser(UserIn user ) ;
	
	@WebMethod
	public List<UserOut> rechercherUser(Long idSociete) ;
}
