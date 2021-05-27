
public class Match {
	Equipe equipe1;//domicile
	Equipe equipe2;//exterieur
	String ButsEquipe1 ;
	String ButsEquipe2;
	String date;
	Cotes cotes;
	//String[] historique;
	

	public Match(Equipe equipe1, Equipe equipe2, String butsEquipe1, String butsEquipe2, String date, Cotes cotes) {
		super();
		this.equipe1 = equipe1;
		this.equipe2 = equipe2;
		this.ButsEquipe1 = butsEquipe1;
		this.ButsEquipe2 = butsEquipe2;
		this.date = date;
		this.cotes = cotes;
	}
	
	@Override
	public String toString() {
		return "equipe1= " + equipe1 + ", equipe2= " + equipe2 + ", ButsEquipe1= " + ButsEquipe1 + ", ButsEquipe2= " + ButsEquipe2 + ", date: " + date + ", Cotes 1N2: " + cotes ;
	}

	public String getButsEquipe1() {
		return ButsEquipe1;
	}

	public String getButsEquipe2() {
		return ButsEquipe2;
	}

	public Equipe getEquipe1() {
		return equipe1;
	}

	public Equipe getEquipe2() {
		return equipe2;
	}

	public String getDate() {
		return date;
	}
	
	public Cotes getCotes() {
		return cotes;
	}

	public void setCotes(Cotes cotes) {
		this.cotes=cotes;
		// TODO Auto-generated method stub
		
	}


	
	
	
	

}
