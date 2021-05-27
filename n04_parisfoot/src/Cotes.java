
public class Cotes {
	double cote1;
	double cote2;
	double coteN;
	
	public Cotes(double cote1, double coteN, double cote2) {
		super();
		this.cote1 = cote1;
		this.cote2 = cote2;
		this.coteN = coteN;
	}
	
	
	


	public double getCote1() {
		return cote1;
	}

	public void setCote1(double cote1) {
		this.cote1 = cote1;
	}

	public double getCote2() {
		return cote2;
	}

	public void setCote2(double cote2) {
		this.cote2 = cote2;
	}

	public double getCoteN() {
		return coteN;
	}

	public void setCoteN(double coteN) {
		this.coteN = coteN;
	}





	@Override
	public String toString() {
		return "Cotes [cote1=" + cote1 + ", coteN=" + coteN + ", cote2=" + cote2 + "]";
	}
	
	
	
	

}
