package fase3;


import java.util.ArrayList;
import java.util.List;

public class Rocket {
	
	private String idRocket= "";
	private List<Propeller> Propellers;
	int speed;
	
	public Rocket(String idRocket, int speed) {
		this.idRocket = idRocket;
		this.speed = speed;
		this.Propellers=new ArrayList <Propeller>();
	}
	
	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
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
	
	public void accelerate() {
		
		System.out.println("______________________________________________________________________________________________");
		
			for(Propeller propeller: Propellers) {
				int current;
				
				current=propeller.getCodePropeller();
				
				System.out.println("\n Rocket" + this.getIdRocket()+ "Propeller" + propeller.getCodePropeller() + " Power " + propeller.getCurrentPower()+" ");
			
			}
		System.out.println("______________________________________________________________________________________________");
		
	}
	
	public void brake() {
		
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return idRocket +": "+ Propellers;
	}
	
}
