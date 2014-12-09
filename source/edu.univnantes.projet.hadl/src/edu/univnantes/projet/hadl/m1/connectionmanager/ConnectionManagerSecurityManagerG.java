package edu.univnantes.projet.hadl.m1.connectionmanager;

import edu.univnantes.projet.hadl.m2.interfaces.Glue;
import edu.univnantes.projet.hadl.m2.interfaces.Role;

public class ConnectionManagerSecurityManagerG extends Glue
{
	public ConnectionManagerSecurityManagerG(String n, Role roleRequis,
			Role roleFourni) {
		super(n, roleRequis, roleFourni);
		// TODO Auto-generated constructor stub
	}
	private ConnectionManagerSecurityManagerPR connectionManagerSecurityManagerPortRequis;
	private ConnectionManagerSecurityManagerPF connectionManagerSecurityManagerPortFourni;
	
	
}
