package edu.univnantes.projet.hadl.m1;

import edu.univnantes.projet.hadl.m1.reponse.ObtenirReponse;
import edu.univnantes.projet.hadl.m1.reponse.Reponse;
import edu.univnantes.projet.hadl.m2.ComposantConcret;

public class HSecurityManager extends ComposantConcret
{
	
	private EnvoyerDemande envoyerDemande;
	private ObtenirReponse obtenirReponse;
	private Reponse reponse;
	private Demande demande;
	
	public HSecurityManager(String name) {
		super(name);
	}
}
