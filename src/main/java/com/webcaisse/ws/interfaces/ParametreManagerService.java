package com.webcaisse.ws.interfaces;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.webcaisse.ws.model.ParametreIn;

@WebService
public interface ParametreManagerService {
	
	
	@WebMethod
	public void sauvegarderParametre(ParametreIn parametre ) ;

}
