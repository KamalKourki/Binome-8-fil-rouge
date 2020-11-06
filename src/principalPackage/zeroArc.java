package principalPackage;

public class zeroArc extends arcSortant {

	public zeroArc(int valeur, Place place, Transition transition) {
		super(valeur, place, transition);
	}

	public Boolean sourceVide() {
		if (this.place.getJetons() == 0) {
			this.active = true;
		} else {
			this.active = false;
		}
		return this.active;
	}

}
