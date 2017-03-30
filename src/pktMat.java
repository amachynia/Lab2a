public class pktMat {
	protected double m; //masa
	public pktMat(){ //konstruktor domyœlny
		m=1;
	}
	public pktMat(double a){ //konstruktor z parametrem
		if(a>0)
		{
			m=a;
		}else{
			System.out.println("Masa musi byc wieksza od zera");
		}
	}
	public double getMasa(){ //akcesor
		return m;
	}
	public double zmienMase(double c){ //zmiana masy
		m = c;
		return m;
	}
	public double momBez(){ //metoda obliczaj¹ca moment bezw³adnoœci
		double i=0;
		return i;
	}
	public double steiner(double d){ //metoda obliczaj¹ca moment bezw³adoœci z twierdzenia Steinera
		double is;
		
		is=momBez()+m*d*d;
		return is;
	}
	public void opis(){ //metoda zwracaj¹ca opis
		System.out.println("Punkt materialny");
	}
	
}