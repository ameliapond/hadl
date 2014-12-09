package edu.univnantes.projet.hadl.m1;

import edu.univnantes.projet.hadl.m1.connectionmanager.ConnectionManagerDataBaseG;
import edu.univnantes.projet.hadl.m1.database.DataBaseConnectionManagerG;
import edu.univnantes.projet.hadl.m2.Connecteur;
import edu.univnantes.projet.hadl.m2.interfaces.InterfaceConnecteur;

public class SQLQuery extends Connecteur{
	
	private ConnectionManagerDataBaseG connectionManagerDataBaseGlue;
	private DataBaseConnectionManagerG dataBaseConnectionManagerGlue;
	
	public SQLQuery(InterfaceConnecteur i1, InterfaceConnecteur i2) {
		super(i1, i2);
	}
}
