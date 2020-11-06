package principalPackage;

public class arcSortant extends Arc {

	public arcSortant(int valeur, Place place, Transition transition) {
		super(valeur, place, transition);
	}
	
	@Override
	public void fire() {
		this.place.enleverJetons(this.Valeur);
	}
	
	@Override
	public Boolean compare() {
		if(this.getValeur() <= this.place.getJetons())
		{
			return true;
		}
		else {
			return false;
		}
	}

}
