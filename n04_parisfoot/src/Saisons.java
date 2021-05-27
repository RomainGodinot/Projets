import java.util.LinkedList;

public class Saisons {
	private LinkedList<Match> matchs;
	private LinkedList<Equipe> listeEquipes;
	
	
	
	
	public Saisons() {
		LireJson js = new LireJson();
		js.lectureEquipe();
		js.lectureMatch();
		listeEquipes= js.getLe();
		matchs=	js.getLm();
		//calculCotes();
	}




	public LinkedList<Match> getMatchs() {
		return matchs;
	}




	public LinkedList<Equipe> getListeEquipes() {
		return listeEquipes;
	}




	public void calculCotes(Match match) {
		int v1 = 0; //compteur de victoires equipe1 
		int v2 = 0; //compteur de victoires equipe2
		int n = 0; //compteur matchs nuls entre equipe1 et equipe2
		LinkedList<Match> lm1v2 = new LinkedList<Match>() ; //initialisation de la liste des matchs entre equipe1 et equipe2
		
		int m = matchs.size();
		int i;
		int j;
		for (i=0; i<m; i++) {
			Match mtmp = matchs.get(i);
			if (isAvant(mtmp.getDate(),match.getDate())) {
				if (mtmp.getEquipe1().equals(match.getEquipe1()) && mtmp.getEquipe2().equals(match.getEquipe2())) {
					lm1v2.add(mtmp);
				}
				
			}
			
		}
		
		int l = lm1v2.size();
		for (j=0;j<l;j++) {
			Match lmj = lm1v2.get(j);
			int e1= Integer.parseInt(lmj.getButsEquipe1());
			int e2= Integer.parseInt(lmj.getButsEquipe2());
			if(e1>e2) {
				v1=v1 +1;
			}
			else if(e1<e2) {
				v2=v2 +1;
			}
			else {
				n=n+1;
			}
		}
		
		double coeff = 0.85;
		double c1;
		double c2;
		double cN;
		
		c1 = l*coeff/ (double)v1;
		c2 =l* coeff/ (double)v2;
		cN = l*coeff/ (double)n;
		
		if (v1 == 0) {
			c1=100;
		}
		if (v2 == 0) {
			c2=100;
		}
		if (n == 0) {
			cN=100;
		}
		
		if (c1<1) {
			c1=1;
		}
		if (c2<1) {
			c1=1;
		}
		if (n<1) {
			c1=1;
		}
		
		c1 = Math.round(c1*10000.0)/10000.0;
		c2 = Math.round(c2*10000.0)/10000.0;
		cN = Math.round(cN*10000.0)/10000.0;
		
		Cotes cote = new Cotes(c1,cN,c2);
		match.setCotes(cote);
		
	
	}




	



	private boolean isAvant(String date, String date2) {
		// TODO Auto-generated method stub
		return true;
	}
}
