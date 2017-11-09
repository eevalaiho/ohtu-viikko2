package ohtu.verkkokauppa;

import java.util.ArrayList;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Ostoskori implements IOstoskori {

    ArrayList<ITuote> tuotteet;

    public Ostoskori() {
        tuotteet = new ArrayList<ITuote>();
    }

    @Autowired
    public void lisaa(ITuote t) {
        tuotteet.add(t);
    }

    @Autowired
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
