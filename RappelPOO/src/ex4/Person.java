package ex4;

public class Person {
	private String name;
	private Compte[] comptes;
	public Person(String name, Compte[] comptes) {
		super();
		this.name = name;
		this.comptes = comptes;
	}
	
	private Compte getCompte(int Num_compte) {
	    for (Compte compte : comptes) {
	      if (compte.getNum_compte()==Num_compte) {
	        return compte;
	      }
	    }
	    return null;
	  }
	
	public void deposer(int num_compte, double valeur) {
		Compte compte = getCompte(num_compte);
		if(compte!=null) {
			compte.Debiter(valeur);
		}
		else {
			System.out.println("compte introuvable");
		}
	}
	
	public void retirer(int num_compte,double valeur) {
		Compte compte = getCompte(num_compte);
		if(compte!=null) {
			compte.Debiter(valeur);
		}
		else {
			System.out.println("compte introuvable");
		}
	}
	
	public void transferer(int to_num_compte,int from_num_compte, double valeur) {
		Compte toCompte = getCompte(to_num_compte);
		Compte fromCompte = getCompte(from_num_compte);
		if(fromCompte!= null && toCompte!=null) {
			fromCompte.Debiter(valeur);
			toCompte.Crediter(valeur);
		}
		else {
			System.out.println("l'un des comptes est introuvable");
		}
		
	}
}
