package com.webcaisse.ws.interfaces;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.webcaisse.ws.model.ProfilVOut;

@WebService
public interface UserManagerService {

	
	@WebMethod
	public List<ProfilVOut> getProfils ();
}
