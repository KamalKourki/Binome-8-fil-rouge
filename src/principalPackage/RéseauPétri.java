package principalPackage;

import java.util.ArrayList;

public class RéseauPétri implements Réseau {

	static int pas = 0;
	Boolean Determinist;
	static ArrayList<Transition> reseauPetriTransitions = new ArrayList<Transition>();

	@Override
	public void ajouterPlace(int idPlace) {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerPlace(int idPlace) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ajouterArc(int idArc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerArc(int idArc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ajouterTransition(int idTransition) {
		reseauPetriTransitions.add(Transition.choisirTransition(idTransition));
	}

	@Override
	public void supprimerTransition(int idTransition) {
		for (Transition trans : reseauPetriTransitions) {
			if (trans.idTransition == idTransition) {
				reseauPetriTransitions.remove(trans);
			}
		}
	}

	public void changerValeurArc(int idArc, int valeur) {
		Arc.choisirArc(idArc).setValeur(valeur);
	}

	public void changerValeurPlace(int idPlace, int Jetons) {
		Place.choisirPlace(idPlace).setJetons(Jetons);
	}

	public void activerReseauPetri() {
		Transition transitionChoisi;
		ArrayList<Transition> tirableTransitions = new ArrayList<Transition>();
		for (Transition trans : reseauPetriTransitions) {
			if (trans.tirabiliteTest()) {
				tirableTransitions.add(trans);
			}
		}
		transitionChoisi = tirableTransitions.get((int) (Math.random() * tirableTransitions.size()));

		for (Arc arc : transitionChoisi.arcsTransition()) {
			arc.fire();
		}
		pas++;
	}
}
