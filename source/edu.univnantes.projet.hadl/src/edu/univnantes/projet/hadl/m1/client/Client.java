package edu.univnantes.projet.hadl.m1.client;

import edu.univnantes.projet.hadl.m2.*;
import edu.univnantes.projet.hadl.m2.interfaces.PortFourni;
import edu.univnantes.projet.hadl.m2.interfaces.PortRequis;

public class Client extends ComposantConcret{

	public Client(String n) {
		super(n);
	}
	
	public void envoyer(String message){
		System.out.println("Envoie du message par client "+this.getName()+": "+message);
		for(PortFourni pf : this.getPortsFourni()){
			if(pf.getNom().equals("pf1")){
				pf.envoyer(message);
			}
		}
	}
	
	public void receive(PortRequis portRequis){
		System.out.println("Reception message par"+getName()+"du port"+portRequis.getNom());
	}
}