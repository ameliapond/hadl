package edu.univnantes.projet.hadl.m1;

import edu.univnantes.projet.hadl.m2.Configuration;
import edu.univnantes.projet.hadl.m2.Connecteur;
import edu.univnantes.projet.hadl.m2.interfaces.InterfaceConnecteur;

public class RPC extends Connecteur
{
	private Configuration configuration;
	
	public RPC(InterfaceConnecteur i1, InterfaceConnecteur i2, Configuration conf) {
		super(i1, i2);
		configuration = conf;
	}

	public Configuration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}
}