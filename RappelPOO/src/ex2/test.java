package ex2;

public class test {

	public static void main(String[] args) {
		int A=0;int B=0;
		De de1 = new De(6);
		De de2 = new De(6);
		while(A<21 && B<21) {
			A=A+de1.random();
			B=B+de2.random();
		}
		System.out.println("A: "+A);
		System.out.println("B: "+ B);
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
