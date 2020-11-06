package principalPackage;

import java.util.ArrayList;

public interface Réseau {
	ArrayList<Integer> Marking = new ArrayList<Integer>();

	public void ajouterPlace(int idPlace);

	public void supprimerPlace(int idPlace);

	public void ajouterArc(int idArc);

	public void supprimerArc(int idArc);

	public void ajouterTransition(int idTransition);

	public void supprimerTransition(int idTransition);

}
