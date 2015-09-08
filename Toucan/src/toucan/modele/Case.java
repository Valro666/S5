package toucan.modele;

import java.util.ArrayList;

public class Case {

	int val;

	int x;
	int y;

	LesMouvements LM = new LesMouvements();
	//ArrayList<Mouvement> alm = new ArrayList<Mouvement>();

	public Case(int a, int b) {
		x = a;
		y = b;
		val = (int) System.nanoTime();
		LM.add(new MoveImmo(x, y));

	}

	public void haut(int i) {
		// alm.add(new MoveDroite(x, y));
		for (int j = 0; j < i; j++) {
			Mouvement m = new MoveHaut(x, y);
			m.move();
			LM.add(m);
			y = m.y;
		}
	}

	public void bas(int i) {
		// alm.add(new MoveBas(x, y));
		for (int j = 0; j < i; j++) {
			Mouvement m = new MoveBas(x, y);
			m.move();
			LM.add(m);
			y = m.y;
		}
	}

	public void gauche(int i) {
		// alm.add(new MoveGauche(x, y));
		for (int j = 0; j < i; j++) {
			Mouvement m = new MoveGauche(x, y);
			m.move();
			LM.add(m);
			x = m.x;
		}
	}

	public void droite(int i) {
		// alm.add(new MoveDroite(x, y));
		for (int j = 0; j < i; j++) {
			Mouvement m = new MoveDroite(x, y);
			m.move();
			LM.add(m);
			x = m.x;
		}
	}

	public void immo(int i) {
		// alm.add(new MoveImmo(x, y));
		for (int j = 0; j < i; j++) {
			Mouvement m = new MoveImmo(x, y);
			m.move();
			LM.add(m);
			x = m.x;
		}
	}

	public Case() {
		val = (int) System.nanoTime();
		System.out.println("adc");
	}

	public int getX(int index) {
		return LM.get(index).x;
	}

	public int getY(int index) {
		return LM.get(index).y;
	}

	@Override
	public String toString() {
		return "Case [LM=" + LM + "]";
	}

	public int getMaxTemps() {
		// TODO Auto-generated method stub

		int tmp = 0;

		for (Mouvement m : LM.alm) {
			tmp++;
		}

		// System.out.println(val+" nb mvt : " + tmp);
		return LM.size();
	}

}
