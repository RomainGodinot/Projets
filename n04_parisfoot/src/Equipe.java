
public class Equipe {
	
	


	public Equipe(String nom) {
		super();
		this.nom = nom;
		
	}

	@Override
	public String toString() {
		return  nom ;
	}

	int tendance;
	String nom;
	

	public int getTendance() {
		return tendance;
	}


	public void setTendance(int tendance) {
		this.tendance = tendance;
	}


	public String getNom() {
		return nom;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipe other = (Equipe) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}
	
	
	

}
