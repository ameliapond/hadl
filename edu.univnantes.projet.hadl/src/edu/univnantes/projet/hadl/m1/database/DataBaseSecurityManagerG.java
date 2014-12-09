package edu.univnantes.projet.hadl.m1.database;

import edu.univnantes.projet.hadl.m2.interfaces.Glue;
import edu.univnantes.projet.hadl.m2.interfaces.Role;

public class DataBaseSecurityManagerG extends Glue {

	private DataBaseSecurityManagerRR dataBaseSecurityManagerRoleRequis;
	private DataBaseSecurityManagerRF dataBaseSecurityManagerRoleFourni;
	
	public DataBaseSecurityManagerG(String n, Role roleRequis, Role roleFourni) {
		super(n, roleRequis, roleFourni);
		// TODO Auto-generated constructor stub
	}
}
