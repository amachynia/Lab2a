
public class kula extends pktMat{
	private double r; //promień
		
	public double getR(){ //akcesor
		return r;
	}
	
	public kula(){ //konstruktor domyślny
		super();
		r=0;
	}
	
	public kula(double m, double r){ //konstruktor z parametrem
		super(m);
		this.r=r;
	}
	
	public double momBez(){ //metoda obliczająca moment bezwładności
		double i=this.m*r*r*2/5;
		return i;
	}
	public void opis(){ //metoda zwracajaca opis
		System.out.println("Kula o promieniu: " + r + ", masie: " + m + ". Moment bezwladnosci: " + momBez() + ".");
	}
}
