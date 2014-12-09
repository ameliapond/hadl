package edu.univnantes.projet.hadl.m1.securitymanager;

import edu.univnantes.projet.hadl.m2.interfaces.Glue;
import edu.univnantes.projet.hadl.m2.interfaces.Role;

public class SecurityManagerConnectionManagerG extends Glue
{
	
	private SecurityManagerConnectionManagerPR securityManagerConnectionManagerPortRequis;
	private SecurityManagerConnectionManagerPF securityManagerConnectionManagerPortFourni;
	
	public SecurityManagerConnectionManagerG(String n, Role roleRequis,
			Role roleFourni) {
		super(n, roleRequis, roleFourni);
	}	
}