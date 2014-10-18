package com.webcaisse.ws.interfaces;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;




import com.webcaisse.ws.model.FamilleOut;
import com.webcaisse.ws.model.PanierOut;
import com.webcaisse.ws.model.ProduitIn;
import com.webcaisse.ws.model.ProduitOut;


@WebService
public interface CaisseManagerService {

	
	@WebMethod
	public List<FamilleOut> getFamillesActivees ();
	
	@WebMethod 
	public List<FamilleOut> getProduitParFamilleReference (String reference);
	
	@WebMethod 
	public Long ajouterProduit(ProduitIn p, Long idMenu) ;
	
	
	@WebMethod 
	public List<ProduitOut> getProductsByFamilly (Long familleId) ;
	
	@WebMethod 
	public ProduitOut loadProductById(Long produitId) ;
	
//	@WebMethod 
//	public PanierOut ajouterProduitAuPanier(ProduitOut p, Long idPanier) ; 
	
}
