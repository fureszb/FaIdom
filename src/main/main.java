
package main;

import model.FaIdom;
import model.Gomb;
import model.Hasab;

public class main {

    
    public static void main(String[] args) {
       
         FaIdomok faIdomok = new FaIdomok();

        FaIdom hasab = new Hasab(5, 3, 4);
        FaIdom gomb = new Gomb(2.5);

        faIdomok.hozzaad(hasab);
        faIdomok.hozzaad(gomb);

        double osszSuly = faIdomok.osszSuly();
        double osszGombSuly = faIdomok.osszGombSuly();
        FaIdom minFaIdom = faIdomok.minV();
        FaIdom maxFaIdom = faIdomok.maxV();

        System.out.println("Össz súly: " + osszSuly);
        System.out.println("Össz gomb súly: " + osszGombSuly);
        System.out.println("Legkisebb térfogatú faidom: " + minFaIdom);
        System.out.println("Legnagyobb térfogatú faidom: " + maxFaIdom);
   
    }


}
