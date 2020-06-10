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
	


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The rocket id is: " + idRocket + ", els propulsors = " + Propellers ;
	}
	
}
