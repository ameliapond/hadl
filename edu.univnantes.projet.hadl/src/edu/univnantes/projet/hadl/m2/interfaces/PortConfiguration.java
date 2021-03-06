package edu.univnantes.projet.hadl.m2.interfaces;

import edu.univnantes.projet.hadl.m2.Binding;

public class PortConfiguration {

	private String nom;
	private Binding binding;
	
	public PortConfiguration(String n){
		nom = n;
	}

	public Binding getBinding() {
		return binding;
	}

	public void setBinding(Binding binding) {
		this.binding = binding;
	}
	
	public void receive(Object arg1){
		System.out.println("Port configuration fourni M2");
	}
}