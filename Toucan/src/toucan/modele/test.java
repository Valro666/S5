package toucan.modele;

public class test {

	public static void main(String[] args) {

		Modele m = new Modele();
		m.CreerLesMouvements();
		
		System.out.println(m.lesCases.toString());

	}
}
