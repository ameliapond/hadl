package edu.univnantes.projet.hadl.m2;

import java.util.ArrayList;

import edu.univnantes.projet.hadl.m1.client.Client;
import edu.univnantes.projet.hadl.m2.interfaces.Port;

public class Configuration extends Composant
{
	protected ArrayList<ComposantConcret> composants;
	private ArrayList<Connecteur> connecteurs;
	private ArrayList<Port> ports;
	
	public Configuration(String name, ComposantConcret composant){
		super(name);
		composants = new ArrayList<ComposantConcret>();
		composants.add(composant);
		connecteurs = new ArrayList<Connecteur>();
		ports =  new ArrayList<Port>();
	}
	
	public Configuration(String name, ArrayList<ComposantConcret> components){
		super(name);
		composants = new ArrayList<ComposantConcret>();
		composants = components;
		connecteurs = new ArrayList<Connecteur>();
		ports =  new ArrayList<Port>();
	}

	public ArrayList<ComposantConcret> getComposants() {
		return composants;
	}

	public void setComposants(ArrayList<ComposantConcret> composants) {
		this.composants = composants;
	}

	public ArrayList<Connecteur> getConnecteurs() {
		return connecteurs;
	}

	public void setConnecteurs(ArrayList<Connecteur> connecteurs) {
		this.connecteurs = connecteurs;
	}

	public ArrayList<Port> getPorts() {
		return ports;
	}

	public void setPorts(ArrayList<Port> ports) {
		this.ports = ports;
	}

	public void ajouterComposant(ComposantConcret composantConcret) {
		composants.add(composantConcret);
	}
}