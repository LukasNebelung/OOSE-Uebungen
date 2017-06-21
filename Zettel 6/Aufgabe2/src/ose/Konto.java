package ose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Keridos on 21/06/17.
 * This Class
 */
public class Konto {
    private long kontostand;
    private String besitzer;
    private List<String> protokoll = new ArrayList<>();


    public Konto(long kontostand, String besitzer) {
        this.kontostand = kontostand;
        this.besitzer = besitzer;
    }

    public long getKontostand() {
        return kontostand;
    }

    public String getBesitzer() {
        return besitzer;
    }

    public String abheben(int value, String reason){
        if (value <= kontostand) {
            protokoll.add(String.format("-%.2f", value/100f) + " "+ reason);
            kontostand -= value;
            return "Erfolg";
        }
        return "Kontodeckung nicht ausreichend.";
    }

    public void einzahlen(int value, String reason){
            protokoll.add(String.format("%.2f", value/100f) + " "+ reason);
            kontostand += value;
    }

    public void generiereKontoauszug(){
        for (String string: protokoll){
            System.out.println(string);
        }
        protokoll.clear();
    }
}
