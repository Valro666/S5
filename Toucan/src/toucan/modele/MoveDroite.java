package toucan.modele;

public class MoveDroite extends Mouvement {

	public MoveDroite(int i, int j) {

		super(i++, j);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		x++;
	}

}
