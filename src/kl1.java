
public class kl1 {
	
	
	
	public static void main(String[] args) {
        walec w1 = new walec(1, 10);
        w1.opis();
        kula k1 = new kula(1, 10);
        k1.opis();
        pret p1 = new pret(1, 10);
        p1.opis();
        
      //Tablica 
        pktMat[] tab = new pktMat[15];
        for (int i=0; i<5; i++){
            walec w = new walec(i+10, i+1);
            tab[i]=w;
            kula k = new kula(i+10, i+1);
            tab[i+5]=k;
            pret p = new pret(i+10, i+1);
            tab[i+10]=p;
        }
        
        System.out.println();
        
        //Wyœwietlenie tablicy
        for(pktMat a : tab){
            a.opis();

        }
        
        System.out.println();
        System.out.println("Wartoœci dla nowej osi");
        System.out.println();
        
        for(pktMat a : tab){
            System.out.println("Masa: "+ a.getMasa() + ". Glowny moment bezwladnosci " + a.momBez() + ". Moment wzgledem nowej osi " + a.steiner(2) + ".");

        }
	}
}
