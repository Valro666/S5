package toucan.modele;

import java.util.ArrayList;

public class LesCases {

	ArrayList<Case> alc = new ArrayList<Case>();

	public LesCases() {

		alc.add(new Case(10, 10));
		alc.add(new Case(20, 10));
		alc.add(new Case(30, 10));
		alc.add(new Case(40, 10));
		alc.add(new Case(50, 10));
		alc.add(new Case(60, 10));

	}

	public void pause(int cellule, int distance) {
		for (int i = 0; i < alc.size(); i++) {
			if (i != cellule) {
				alc.get(i).immo(distance);
			}
		}
	}

	public void pause(int distance, int... cellule) {

		boolean pause = false;

		for (int i = 0; i < alc.size(); i++) {
			for (int z : cellule) {
				if (z == i) {
					pause = true;
				}
			}

			if (!pause) {
				alc.get(i).immo(distance);
			}
			
			pause = false ;
		}

	}

	public void haut(int cellule, int distance) {
		alc.get(cellule).haut(distance);
		// pause(cellule, distance);

	}

	public void bas(int cellule, int distance) {
		alc.get(cellule).bas(distance);
		// pause(cellule, distance);
	}

	public void gauche(int cellule, int distance) {
		alc.get(cellule).gauche(distance);
		// pause(cellule, distance);
	}

	public void droite(int cellule, int distance) {
		alc.get(cellule).droite(distance);
		// pause(cellule, distance);
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

	public int getMaxTemps() {
		return alc.size();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < alc.size(); i++) {
			sb.append("Case " + i + ": ");
			Case c = alc.get(i);
			for (int t = 0; t <= c.LM.alm.size() - 1; t++) {
				int x = c.getX(t);
				int y = c.getY(t);
				sb.append("\t" + t + " (" + x + "," + y + ") ");
				if (t % 5 == 0) {
					sb.append("\n\t");
				}
			}
			sb.append("\n");
		}
		return sb.toString();
	}

}
