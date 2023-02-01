package ex3;
public class Angle {
	private double angle;

	public Angle(double angle) {
		super();
		this.setAngle(angle);
	}
	
	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		if(angle<0 || angle>360) {
			throw new ArithmeticException("Angle must be within bounds");
		}
		
		else {
		this.angle = angle;
		}
	}
	
	public void addition(double ang) {
		this.angle+=ang;
		if(this.angle>360) {
			throw new ArithmeticException("Angle must be within bounds");
		}
		else {
			System.out.println("Angle is valid");
		}
	}
	public void soustraction(double ang) {
		this.angle-=ang;
		if(this.angle<0) {
			throw new ArithmeticException("Angle must be within bounds");
		}
		else {
			System.out.println("Angle is valid");
		}
		}
	
	
	public void multiplication(double ang) {
		this.angle*=ang;
		if(this.angle<0 || this.angle>360) {
			throw new ArithmeticException("Angle must be within bounds");
		}
		else {
			System.out.println("Angle is valid");
		}
	}
	public double conversion() {
		return (Math.PI*angle)/180;
	}
	
	public double sinus() {
		return Math.sin(this.angle);
	}
	
	public double cosinus() {
		return Math.cos(this.angle);
	}
	
	public double tan() {
		return Math.tan(this.angle);
	}
	
}
