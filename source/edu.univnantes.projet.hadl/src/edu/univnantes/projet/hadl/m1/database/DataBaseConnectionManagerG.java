package edu.univnantes.projet.hadl.m1.database;

import edu.univnantes.projet.hadl.m2.interfaces.Glue;
import edu.univnantes.projet.hadl.m2.interfaces.Role;

public class DataBaseConnectionManagerG extends Glue
{
	
	private DataBaseConnectionManagerRF dataBaseConnectionManagerRoleFourni;
	private DataBaseConnectionManagerRR dataBaseConnectionManagerRoleRequis;
	
	public DataBaseConnectionManagerG(String n, Role roleRequis, Role roleFourni) {
		super(n, roleRequis, roleFourni);
		// TODO Auto-generated constructor stub
	}
}
