package main;

import java.util.ArrayList;
import java.util.List;
import model.FaIdom;

public class FaIdomok {
    private List<FaIdom> faIdomLista;

    public FaIdomok() {
        faIdomLista = new ArrayList<>();
    }
    
    public void hozzaad(FaIdom faIdom) {
        faIdomLista.add(faIdom);
    }

    public double osszSuly() {
        double osszSuly = 0;
        for (FaIdom faIdom : faIdomLista) {
            osszSuly += faIdom.suly();
        }
        return osszSuly;
    }

    public double osszGombSuly() {
        double osszGombSuly = 0;
        for (FaIdom faIdom : faIdomLista) {
            if (faIdom instanceof model.Gomb) {
                osszGombSuly += faIdom.suly();
            }
        }
        return osszGombSuly;
    }

    public FaIdom minV() {
      
        FaIdom minFaIdom = faIdomLista.get(0);
        for (FaIdom faIdom : faIdomLista) {
            if (faIdom.terfogat() < minFaIdom.terfogat()) {
                minFaIdom = faIdom;
            }
        }
        return minFaIdom;
    }

    public FaIdom maxV() {
   
        FaIdom maxFaIdom = faIdomLista.get(0);
        for (FaIdom faIdom : faIdomLista) {
            if (faIdom.terfogat() > maxFaIdom.terfogat()) {
                maxFaIdom = faIdom;
            }
        }
        return maxFaIdom;
    }

    public void run() {
       
    }
}
