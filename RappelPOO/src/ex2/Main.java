package ex2;

public class Main {

	public static void main(String[] args) {
		int i;
		int A=0;int B=0;
		De de1 = new De(6);
		De de2 = new De(6);
		for(i=0;i<10;i++) {
			A= A+ de1.random();
			B= B+ de2.random();
		}
		if(A>B) {
			System.out.println("le gagnant est Monsieur A avec un total de point de " + A);
			System.out.println("Monsieur B perd avec un total de point de " + B);
			
		}
		else {
			System.out.println("le gagnant est Monsieur B avec un total de point de " + B);
			System.out.println("Monsieur A perd avec un total de point de " + A);
		}

	}

}
