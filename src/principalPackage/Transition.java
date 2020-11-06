package principalPackage;

import java.util.ArrayList;

public class Transition {
	static int transCompt = 0;
	public static ArrayList<Transition> transitionsList = new ArrayList<Transition>();

	int idTransition;

	public Transition() {
		this.idTransition = transCompt++;
		transitionsList.add(this);
	}

	public Boolean tirabiliteTest() {
		Boolean test = true;
		for (Arc a : this.arcsTransition()) {
			test = a.compare();
			if (test) {
				return false;
			}
		}
		return true;
	}

	public static Transition choisirTransition(int idTrans) {
		for (Transition trans : Transition.transitionsList) {
			if (trans.getIdTransition() == idTrans) {
				return trans;
			}
		}
		return null;
	}

	public ArrayList<Arc> arcsTransition() {
		ArrayList<Arc> arcstransition = new ArrayList<Arc>();
		for (Arc a : Arc.arcsList) {
			if (a.transition.getIdTransition() == this.idTransition) {
				arcstransition.add(a);
			}
		}
		return arcstransition;
	}

	public int getIdTransition() {
		return idTransition;
	}

	public void setIdTransition(int idTransition) {
		this.idTransition = idTransition;
	}
}
