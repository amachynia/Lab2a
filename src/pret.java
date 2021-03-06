
public class pret extends pktMat{
	private double l; //długość
	
	public double getL(){ //akcesor
		return l;
	}
	
	public pret(){ //konstruktor domyślny
		super();
		l=0;
	}
	
	public pret(double m, double l){ //konstruktor z parametrem
		super(m);
		this.l=l;
	}
	
	public double momBez(){ //metoda obliczająca moment bezwładności
		double i=this.m*l*l/12;
		return i;
	}
	public void opis(){ //metoda zwracajaca opis
		System.out.println("Pret o dlugosci: " + l + ", masie: " + m + ". Moment bezwladnosci: " + momBez() + ".");
	}
}
