package ex4;

public class Compte {
	private int num_compte;
	private double solde;
	private String owner;

	public Compte(int num_compte, double solde, String owner) {
		super();
		this.num_compte = num_compte;
		this.solde = solde;
		this.owner = owner;
	}
	
	public void Crediter(double value) {
		solde += value;
	}
	
	public void Debiter(double value) {
		if(solde>=value) {
		solde -=value;
		}
		else {System.out.println("solde insuffisant");}
	}

	public int getNum_compte() {
		return num_compte;
	}

	public double getSolde() {
		return solde;
	}
	
	public String getOwner() {
		return owner;
	}

}





