package com.webcaisse.ws.interfaces;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.webcaisse.ws.model.FamilleOut;
import com.webcaisse.ws.model.ProduitIn;


@WebService
public interface CaisseManagerService {

	
	@WebMethod
	public List<FamilleOut> getFamillesActivees ();
	
	@WebMethod 
	public List<FamilleOut> getProduitParFamilleReference (String reference);
	
	@WebMethod 
	public Long ajouterProduit(ProduitIn p, Long idMenu) ;
}
