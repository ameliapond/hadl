package edu.univnantes.projet.hadl.m1;

import java.util.ArrayList;

import edu.univnantes.projet.hadl.m1.client.Client;
import edu.univnantes.projet.hadl.m2.*;

public class ClientServeur extends Configuration
{ 
	Client client;
	Configuration servConf;
	
	public ClientServeur(String name, Client cli) {
		super(name,cli);
		client = cli;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Configuration getServConf() {
		return servConf;
	}

	public void setServConf(Configuration servConf) {
		this.servConf = servConf;
	}
}