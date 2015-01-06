package com.webcaisse.ws.interfaces;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.webcaisse.ws.model.CommandeIn;
import com.webcaisse.ws.model.FamilleIn;
import com.webcaisse.ws.model.FamilleOut;
import com.webcaisse.ws.model.ProduitIn;
import com.webcaisse.ws.model.ProduitOut;


@WebService
public interface CaisseManagerService {

	
	@WebMethod
	public List<FamilleOut> getFamillesActivees (Long idSociete);
	
	@WebMethod 
	public List<FamilleOut> getProduitParFamilleReference (String reference);
	
	@WebMethod 
	public void ajouterProduit(ProduitIn p) ;
	
	@WebMethod 
	public List<ProduitOut> getProductsByFamilly (Long familleId) ;
	
	@WebMethod 
	public ProduitOut loadProductById(Long produitId) ;
	
	@WebMethod 
	public FamilleOut loadFamilleById(Long IdFamille) ;
	
    @WebMethod
    public Long sauvegarderCommande(CommandeIn in) ;
    
    @WebMethod
    public void supprimerProduit(Long idProduit);
    
    @WebMethod 
    public void updateProduit(ProduitIn p);
    
    @WebMethod 
	public void ajouterFamille(FamilleIn f) ;
    
    @WebMethod
    public void supprimerFamille(Long idFamille);
    
    @WebMethod 
    public void updateFamille(FamilleIn f);
	
}
