package edu.univnantes.projet.hadl.m1.connectionmanager;

import edu.univnantes.projet.hadl.m2.interfaces.Glue;
import edu.univnantes.projet.hadl.m2.interfaces.Role;

public class ConnectionManagerDataBaseG extends Glue
{
	private ConnectionManagerDataBaseRR ConnectionManagerDataBaseRoleRequis;
	private ConnectionManagerDataBaseRF connectionManagerDataBaseRoleFourni;
	
	public ConnectionManagerDataBaseG(String n, Role roleRequis, Role roleFourni) {
		super(n, roleRequis, roleFourni);
		// TODO Auto-generated constructor stub
	}
}