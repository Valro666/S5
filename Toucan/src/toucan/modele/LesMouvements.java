package toucan.modele;

import java.util.ArrayList;

public class LesMouvements {

	ArrayList<Mouvement> alm = new ArrayList<Mouvement>();

	public String toString() {
		return "LesMouvements [alm=" + alm + "]";
	}

	public void add(Mouvement m) {
		// TODO Auto-generated method stub
		alm.add(m);

	}

	public Mouvement get(int index) {
		// TODO Auto-generated method stub
		return alm.get(index);
	}

	public int size() {
		// TODO Auto-generated method stub
		return alm.size();
	}

}
