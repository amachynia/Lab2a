public class pktMat {
	protected double m; //masa
	public pktMat(){ //konstruktor domyślny
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
	public double momBez(){ //metoda obliczająca moment bezwładności
		double i=0;
		return i;
	}
	public double steiner(double d){ //metoda obliczająca moment bezwładości z twierdzenia Steinera
		double is;
		
		is=momBez()+m*d*d;
		return is;
	}
	public void opis(){ //metoda zwracająca opis
		System.out.println("Punkt materialny");
	}
	
}