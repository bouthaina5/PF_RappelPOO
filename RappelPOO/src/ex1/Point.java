package ex1;

public class Point {
	private int cordx;
	private int cordy;
	private String couleur;
	private String nom;
	public Point() {};
	public  Point(int cordx,int cordy, String couleur,String nom) {
		this.cordx=cordx;
		this.cordy = cordy;
		this.couleur = couleur;
		this.nom = nom;
	}
	public Point(int cordx,int cordy) {
		this.cordx=cordx;
		this.cordy = cordy;
	}
	
	public void changerx(int x) {
		cordx = x;
	}
	public void changery(int y) {
		cordy=y;
	}
	public void deplacerpoint(int dx , int dy) {
		cordx += dx;
		cordy +=dy;
	}
	public int getx() {
		return cordx;
	}
	public int gety() {
		return cordy;
	}
	
	public void changercouleur(String newColor) {
		couleur = newColor;
	}
	public void Afficher() {
		System.out.printf("abcisse :"+cordx+" ordonne: "+cordy+"\n");
	}
	}