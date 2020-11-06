package principalPackage;

public class videurArc extends arcSortant {

	public videurArc(int valeur, Place place, Transition transition) {
		super(valeur, place, transition);
	}

	public void vider() {
		this.activer();
		if (this.active) {
			this.place.setJetons(0);
		}
	}

	public void activer() {
		if (this.place.getJetons() != 0) {
			this.active = true;
		} else {
			this.active = false;
		}
	}
}
