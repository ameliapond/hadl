package edu.univnantes.projet.hadl.m2.interfaces;


public class RoleRequis extends Role 
{
	private String nom;
	
	public RoleRequis(String n){
		nom = n;
	}
	
	public void receive(String message){
		System.out.println("reception du message: "+message+"par"+getNom());
	}
	
	public String getNom(){
		return nom;
	}
}