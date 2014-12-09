package edu.univnantes.projet.hadl.m1.connectionmanager;

import edu.univnantes.projet.hadl.m1.Autorisation;
import edu.univnantes.projet.hadl.m1.EnvoyerRequete;
import edu.univnantes.projet.hadl.m1.ObtenirRequete;
import edu.univnantes.projet.hadl.m1.RequeteEntree;
import edu.univnantes.projet.hadl.m1.RequeteSortie;
import edu.univnantes.projet.hadl.m1.reponse.Reponse;
import edu.univnantes.projet.hadl.m2.ComposantConcret;

public class ConnectionManager extends ComposantConcret
{
	public ConnectionManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	private RequeteEntree requeteEntree;
	private RequeteSortie requeteSortie;
	private EnvoyerRequete envoieRequete;
	private ObtenirRequete obtenirRequete;
	private Autorisation autorisation;
	private Reponse reponse;
}
