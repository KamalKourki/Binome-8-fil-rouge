package principalPackage;

public class arcEntrant extends Arc {

	public arcEntrant(int valeur, Place place, Transition transition) {
		super(valeur, place, transition);
	}
	
	@Override
	public void fire() {
		this.place.ajouterJetons(this.Valeur);
	}
	
	@Override
	public Boolean compare() {
		return super.compare();
	}

}
