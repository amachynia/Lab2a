
public class walec extends pktMat {
	private double r; //promie�
	
	public double getR(){ //akcesor
		return r;
	}
	
	public walec(){ //konstruktor domy�lny
		super();
		r=0;
	}
	
	public walec(double m, double r){ //konstruktor z parametrem
		super(m);
		this.r=r;
	}
	
	public double momBez(){ //metoda obliczaj�ca moment bezw�adno�ci
		double i=this.m*r*r/2;
		return i;
	}
	public void opis(){ //metoda zwracajaca opis
		System.out.println("Walec o promieniu: " + r + ", masie: " + m + ". Moment bezwladnosci: " + momBez() + ".");
	}
}
