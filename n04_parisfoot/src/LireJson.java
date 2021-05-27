import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class LireJson {
	
	LinkedList<Equipe> le = new LinkedList<Equipe>();
	
	public LinkedList<Equipe> getLe() {
		return le;
	}

	LinkedList<Match> lm = new LinkedList<Match>();
		
	public LinkedList<Match> getLm() {
		return lm;
	}


	public LinkedList<Equipe> lectureEquipe(){
		JSONParser parser = new JSONParser();
		try {
			Object obj  = parser.parse(new FileReader("matchs.json")); 
			JSONObject jsonObject = (JSONObject) obj; 
			JSONArray  matchs = (JSONArray)  jsonObject.get("matchs");
			
			Iterator<JSONObject> it = matchs.iterator();
			while (it.hasNext()) {
				JSONObject m = it.next();
				String at = (String) m.get("AwayTeam");
				String ht = (String) m.get("HomeTeam");
				
				Equipe eat = new Equipe(at);
				if(le.contains(eat)==false) {
					le.add(eat);
				}
				Equipe eht = new Equipe(ht);
				if(le.contains(eht)==false) {
					le.add(eht);
				}
			}

			
		} catch (Exception e) { 
			e.printStackTrace(); 
		} 
		//System.out.println(le);
		return le;
	}
		
	
		public LinkedList<Match> lectureMatch(){
			
		JSONParser parser = new JSONParser();
		try {
			Object obj  = parser.parse(new FileReader("matchs.json")); 
			JSONObject jsonObject = (JSONObject) obj; 
			JSONArray  matchs = (JSONArray)  jsonObject.get("matchs");
			
			Iterator<JSONObject> it = matchs.iterator();
			while (it.hasNext()) {
				JSONObject m = it.next();
				String at = (String) m.get("AwayTeam");
				String ht = (String) m.get("HomeTeam");
				String fthg = (String) m.get("FTHG");
				String ftag = (String) m.get("FTAG");
				String ftr = (String) m.get("FTR");
				String date = (String) m.get("Date");
				
				Equipe eat = rechercherEquipe(at);
				Equipe eht = rechercherEquipe(ht);
				
				Cotes cotes = new Cotes(0,0,0);
				Match ma = new Match(eht, eat, fthg, ftag, date, cotes);
				lm.add(ma);
				
				//System.out.println(ma);
			}

			
		} catch (Exception e) { 
			e.printStackTrace(); 
		} 
		//System.out.println(lm);
		return lm;
	}
 
		
		

		private Equipe rechercherEquipe(String at) {
			// TODO Auto-generated method stub
			int i;
			int l = le.size();
			Equipe equipe = null;
			for (i=0;i<l;i++) {
				if (le.get(i).getNom().equals(at)) {
					equipe = le.get(i) ;
					
				}
			}
			return equipe;
			
		}
		
	


}
