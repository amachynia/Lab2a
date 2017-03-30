
public class walec extends pktMat {
	private double r; //promieñ
	
	public double getR(){ //akcesor
		return r;
	}
	
	public walec(){ //konstruktor domyœlny
		super();
		r=0;
	}
	
	public walec(double m, double r){ //konstruktor z parametrem
		super(m);
		this.r=r;
	}
	
	public double momBez(){ //metoda obliczaj¹ca moment bezw³adnoœci
		double i=this.m*r*r/2;
		return i;
	}
	public void opis(){ //metoda zwracajaca opis
		System.out.println("Walec o promieniu: " + r + ", masie: " + m + ". Moment bezwladnosci: " + momBez() + ".");
	}
}
