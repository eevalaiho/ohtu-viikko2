package ohtu.verkkokauppa;

import java.util.ArrayList;

public class Ostoskori implements IOstoskori {

    ArrayList<ITuote> tuotteet;

    public Ostoskori() {
        tuotteet = new ArrayList<ITuote>();
    }

    public void lisaa(ITuote t) {
        tuotteet.add(t);
    }

    public void poista(ITuote t) {
        tuotteet.remove(t);
    }

    public int hinta() {
        int hinta = 0;

        for (ITuote tuote : tuotteet) {
            hinta += tuote.getHinta();
        }

        return hinta;
    }
}
