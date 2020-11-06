package principalPackage;

import java.util.ArrayList;

public class Arc {
	static int arcCompt = 0;
	public static ArrayList<Arc> arcsList = new ArrayList<Arc>();

	int idArc;
	int Valeur = 1;
	Boolean active = true;
	Place place;
	Transition transition;

	public Arc(int valeur, Place place, Transition transition) {
		this.idArc = arcCompt++;
		this.Valeur = valeur;
		this.place = place;
		this.transition = transition;
		arcsList.add(this);
	}

	public void fire() {

	}
	
	public Boolean compare() {
		return true;
	}

	public static Arc choisirArc(int idArc) {
		for (Arc arc : Arc.arcsList) {
			if (arc.getIdArc() == idArc) {
				return arc;
			}
		}
		return null;
	}
	
	public int getIdArc() {
		return idArc;
	}

	public void setIdArc(int idArc) {
		this.idArc = idArc;
	}

	public int getValeur() {
		return Valeur;
	}

	public void setValeur(int valeur) {
		Valeur = valeur;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
