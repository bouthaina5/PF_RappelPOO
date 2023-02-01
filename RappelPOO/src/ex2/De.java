package ex2;
 import java.util.Random;
public class De {
	private int nb_faces;
	public int random() {
		Random rand = new Random();
		return rand.nextInt(5)+1;
	}
	public De(int nb_faces) {
		this.nb_faces = nb_faces;
	}
	
}
