package toucan.modele;

import java.util.ArrayList;

public class LesCases {

	ArrayList<Case> alc = new ArrayList<Case>();

	public LesCases() {

		Case c = new Case(0, 0);
		c.droite(12);

		Case d = new Case(0, 0);
		d.droite(4);
		alc.add(c);
		alc.add(d);

	}

	public void droite(int cellule, int distance) {
		alc.get(cellule).droite(distance);
	}

	int size() {
		return alc.size();
	}

	Case get(int i) {
		return alc.get(i);
	}

	void affecter() {

	}

	void comparer() {

	}

}
