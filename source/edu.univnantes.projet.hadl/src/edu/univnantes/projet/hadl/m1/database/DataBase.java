package edu.univnantes.projet.hadl.m1.database;

import edu.univnantes.projet.hadl.m1.EnvoyerResultat;
import edu.univnantes.projet.hadl.m1.ObtenirDemande;
import edu.univnantes.projet.hadl.m1.ObtenirRequete;
import edu.univnantes.projet.hadl.m1.reponse.EnvoyerReponse;
import edu.univnantes.projet.hadl.m2.ComposantConcret;

public class DataBase extends ComposantConcret
{
	
	private EnvoyerResultat envoyerResultat;
	private EnvoyerReponse envoyerReponse;
	private ObtenirRequete obtenirRequete;
	private ObtenirDemande obtenirDemande;
	
	public DataBase(String name) {
		super(name);
	}
}