package fase3;

public class Propeller {
	
	private int codePropeller;
	private int maxPower;
	private int currentPower=0;
	
	public int getCodePropeller() {
		return codePropeller;
	}

	public void setCodePropeller(int codePropeller, int maxPower, int currentPower) {
		this.codePropeller = codePropeller;
		this.maxPower = maxPower;
		this.currentPower = currentPower;
		
	}

	public int getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}

	public int getCurrentPower() {
		return currentPower;
	}

	public void setCurrentPower(int currentPower) {
		this.currentPower = currentPower;
	}

	Propeller(int codePropeller) {
		this.codePropeller=codePropeller;
	}

	@Override
	public String toString() {
		return " [" + codePropeller + ", maxPower " + maxPower +",currentPower" + currentPower;
	}


}