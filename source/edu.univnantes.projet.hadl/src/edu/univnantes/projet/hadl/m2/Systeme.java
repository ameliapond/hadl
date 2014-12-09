package edu.univnantes.projet.hadl.m2;

import edu.univnantes.projet.hadl.m1.ClientServeur;

public class Systeme {
	
	private ClientServeur configurationClientServeur;
	
	public Systeme(ClientServeur conf){
		configurationClientServeur= conf;
	}

	public ClientServeur getClientServeur() {
		return configurationClientServeur;
	}

	public void setClientServeur(ClientServeur configCS) {
		configurationClientServeur = configCS;
	}
}