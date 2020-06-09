package fase1;

import java.util.ArrayList;
import java.util.List;

public class Rocket {
	
	private String idCoet= "";
	private List<Propulsor> Propulsors;
	
	public Rocket(String idCoet) {
		this.idCoet = idCoet;
		this.Propulsors=new ArrayList <Propulsor>();
	}
	
	public String getIdCoet() {
		return idCoet;
	}

	public void setIdCoet(String idCoet) {
		this.idCoet = idCoet;
	}

	public List<Propulsor> getPropulsors() {
		return Propulsors;
	}

	public void setPropulsors(List<Propulsor> propulsors) {
		Propulsors = propulsors;
	}
	
	public void addPropulsor(Propulsor propulsor){
		Propulsors.add(propulsor);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The rocket id is: " + idCoet + ", els propulsors = " + Propulsors ;
	}
	
	
	
}
