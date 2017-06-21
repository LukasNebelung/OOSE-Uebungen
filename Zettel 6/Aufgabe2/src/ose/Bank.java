package ose;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

/**
 * Created by Keridos on 21/06/17.
 * This Class
 */
public class Bank {
    private long rücklage = 100000000; //10.000.000 euro * 100 für cent beträge
    private List<Konto> konten = new ArrayList<>();
    private List<String> protokoll = new ArrayList<>();
    Random rand = new Random();

    public void invest() {
        int änderung = rand.nextInt(50) - 30;
        long gesamtBeträgeKontenVorher = 0;
        long gesamtBeträgeKontenNachher = 0;
        long rücklageVorher = rücklage;
        for (Konto konto : konten) {
            gesamtBeträgeKontenVorher += konto.getKontostand();
        }
        int veränderung = Math.round(Math.min(gesamtBeträgeKontenVorher, rücklage / 2) * (änderung / 100f));
        rücklage -= veränderung;
        for (Konto konto : konten) {
            if (veränderung > 0) {
                konto.einzahlen(Math.round(veränderung / konten.size()), "Investment");
            } else {
                konto.abheben(Math.round(veränderung / konten.size()), "Investment");
            }
        }
        for (Konto konto : konten) {
            gesamtBeträgeKontenNachher += konto.getKontostand();
        }
        protokoll.add("Differenz Rücklagen: " + String.format("%.2f", (rücklage - rücklageVorher) / 100f) +
                " - Differenz Kontostände: " + String.format("%.2f", (gesamtBeträgeKontenNachher - gesamtBeträgeKontenVorher) / 100f) +
                " - Änderung in %: " + änderung);
    }

    public void addKonto(String besitzer, long startgeld) {
        konten.add(new Konto(startgeld, besitzer));
    }

    public void addKonto(Konto konto) {
        konten.add(konto);
    }

    public void removeKonto(String besitzer) {
        Predicate<Konto> predicate = p -> p.getBesitzer().equals(besitzer);
        konten.removeIf(predicate);
    }

    public void transferKontoToBank(Bank bank, String besitzer) {
        Predicate<Konto> predicate = p -> p.getBesitzer().equals(besitzer);
        Konto konto = null;
        for (Konto k : konten) {
            if (k.getBesitzer().equals(besitzer)) {
                konto = k;
            }
        }
        if (konto != null) {
            bank.addKonto(konto);
            System.out.println("transferred Konto from " + besitzer);
        } else {
            System.out.println("could not find Konto from " + besitzer);
        }
        konten.removeIf(predicate);
    }

    public void printJahresbericht() {
        System.out.println("Jahresbericht:");
        for (String string : protokoll) {
            System.out.println("Investment " + (protokoll.indexOf(string) + 1) + ": " + string);
        }
        protokoll.clear();
    }
}
