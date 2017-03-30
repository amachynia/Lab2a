
public class pret extends pktMat{
	private double l; //d³ugoœæ
	
	public double getL(){ //akcesor
		return l;
	}
	
	public pret(){ //konstruktor domyœlny
		super();
		l=0;
	}
	
	public pret(double m, double l){ //konstruktor z parametrem
		super(m);
		this.l=l;
	}
	
	public double momBez(){ //metoda obliczaj¹ca moment bezw³adnoœci
		double i=this.m*l*l/12;
		return i;
	}
	public void opis(){ //metoda zwracajaca opis
		System.out.println("Pret o dlugosci: " + l + ", masie: " + m + ". Moment bezwladnosci: " + momBez() + ".");
	}
}
