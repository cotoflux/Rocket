package fase1;

import java.util.ArrayList;
import java.util.List;

public class Rocket {
	
	private String idRocket= "";
	private List<Propeller> Propellers;
	
	public Rocket(String idRocket) {
		this.idRocket = idRocket;
		this.Propellers=new ArrayList <Propeller>();
	}
	


	public List<Propeller> getPropellers() {
		return Propellers;
	}



	public void setPropellers(List<Propeller> propellers) {
		Propellers = propellers;
	}



	public String getIdRocket() {
		return idRocket;
	}



	public void setIdRocket(String idRocket) {
		this.idRocket = idRocket;
	}

	public void addPropellers(Propeller propeller) {
		Propellers.add(propeller);
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The rocket id is: " + idRocket + ", the propellers are = " + Propellers ;
	}
	
}
