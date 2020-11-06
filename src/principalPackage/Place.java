package principalPackage;

import java.util.ArrayList;

public class Place {
	static int placeCompt = 0;
	public static ArrayList<Place> placesList = new ArrayList<Place>();

	int idPlace;
	int Jetons;

	public Place() {

	}

	public Place(int Jetons) {
		this.Jetons = Jetons;
	}

	public static Place choisirPlace(int idPlace) {
		for (Place place : Place.placesList) {
			if (place.getIdPlace() == idPlace) {
				return place;
			}
		}
		return null;
	}
	
	public int getIdPlace() {
		return idPlace;
	}

	public void setIdPlace(int idPlace) {
		this.idPlace = idPlace;
	}

	public int getJetons() {
		return Jetons;
	}

	public void setJetons(int jetons) {
		Jetons = jetons;
	}

	public Boolean ajouterJetons(int nombre) {
		this.Jetons += nombre;
		return true;
	}

	public Boolean enleverJetons(int nombre) {
		this.Jetons -= nombre;
		return true;
	}

}
