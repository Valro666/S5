package toucan.modele;

public class Modele {

	LesCases lesCases = new LesCases();

	Algo actuel;

	static int TEMP = 1;

	public Modele() {

	}

	public void CreerLesMouvements() {

		lesCases.haut(0, 5);
		lesCases.pause(0, 5);

		lesCases.droite(0, 10);
		lesCases.bas(1, 10);

		lesCases.pause(10, 0, 1);

		// lesCases.pause(0, 10);
		//
		// lesCases.pause(10, lesCases.alc.get(0), lesCases.alc.get(1));

		// lesCases.pause(0, 10);
		// lesCases.pause(0, 10);

	}

	// public String toString() {
	// StringBuilder sb = new StringBuilder();
	// for (int i = 0; i < lesCases.size(); i++) {
	// sb.append("Case " + i/* lesCases.get(i).val */+ ": ");
	// Case c = lesCases.get(i);
	// for (int t = 0; t <= c.getMaxTemps(); t++) {
	// int x = c.getX(t);
	// int y = c.getY(t);
	// sb.append("->" + t + " (" + x + "," + y + ") ");
	// if (t % 5 == 0) {
	// sb.append("");
	// }
	// }
	// sb.append("\n\n");
	// }
	// return sb.toString();
	// }

	// private int getMaxTemps() {
	// // TODO Auto-generated method stub
	//
	// int tmp = 0;
	//
	// for (Case c : lesCases.alc) {
	// for (Mouvement m : c.LM.alm) {
	// tmp++;
	// }
	// }
	// System.out.println("nb mvt : " + tmp);
	// return tmp;
	// }
}
