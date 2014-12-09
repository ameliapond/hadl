package edu.univnantes.projet.hadl.m1;

import edu.univnantes.projet.hadl.m2.*;
import edu.univnantes.projet.hadl.m2.interfaces.PortFourni;
import edu.univnantes.projet.hadl.m2.interfaces.PortRequis;

public class Serveur extends ComposantConcret
{
	private Configuration configuration;
	private PortRequis ServeurEntree;
	private PortFourni ServeurSortie;
	
	public Serveur(String name) {
		super(name);
	}
}