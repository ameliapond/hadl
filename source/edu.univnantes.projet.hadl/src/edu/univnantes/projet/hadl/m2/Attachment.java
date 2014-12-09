package edu.univnantes.projet.hadl.m2;

import edu.univnantes.projet.hadl.m2.interfaces.Port;
import edu.univnantes.projet.hadl.m2.interfaces.PortFourni;
import edu.univnantes.projet.hadl.m2.interfaces.PortRequis;
import edu.univnantes.projet.hadl.m2.interfaces.Role;
import edu.univnantes.projet.hadl.m2.interfaces.RoleFourni;
import edu.univnantes.projet.hadl.m2.interfaces.RoleRequis;

public class Attachment implements Connexion{
	
	private Port port;
	private Role role;
	
	public Attachment(PortFourni portFourni, RoleRequis roleRequis){
		this.port = portFourni;
		this.role = roleRequis;
	}
	
	public Attachment(PortRequis portRequis, RoleFourni roleFourni){
		this.port = portRequis;
		this.role = roleFourni;
	}
	
	public Port getPort() {
		return port;
	}
	
	public void setPort(Port port) {
		this.port = port;
	}
	
	public Role getRole() {
		return role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
}