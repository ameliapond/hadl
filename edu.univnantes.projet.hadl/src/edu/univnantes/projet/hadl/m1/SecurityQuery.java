package edu.univnantes.projet.hadl.m1;

import edu.univnantes.projet.hadl.m1.database.DataBaseSecurityManagerG;
import edu.univnantes.projet.hadl.m1.securitymanager.SecurityManagerDataBaseG;
import edu.univnantes.projet.hadl.m2.ComposantConcret;

public class SecurityQuery extends ComposantConcret{
	
	private DataBaseSecurityManagerG dataBaseSecurityManagerGlue;
	private SecurityManagerDataBaseG securityManagerDataBaseGlue;
	
	public SecurityQuery(String name) {
		super(name);
	}
}