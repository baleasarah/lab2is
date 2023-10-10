package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Biblioteca {
    private List<Carte> carti;
    private String fraza;

    public Biblioteca() {
        carti = new ArrayList<>();
        initializareColectie();
    }
    private void initializareColectie() {
        List<String> frazeCarte1 = new ArrayList<>();
        frazeCarte1.add("Aceasta este fraza 1 pentru Glossa");
        frazeCarte1.add("Aceasta este fraza 2 pentru Glossa");
        frazeCarte1.add("Aceasta este fraza 3 pentru Glossa");

        List<String> frazeCarte2 = new ArrayList<>();
        frazeCarte2.add("Aceasta este fraza 1 pentru Moara cu Noroc");
        frazeCarte2.add("Aceasta este fraza 2 pentru Moara cu Noroc");

        List<String> frazeCarte3 = new ArrayList<>();
        frazeCarte3.add("Aceasta este fraza 1 pentru Amintiri din copilarie");
        frazeCarte3.add("Aceasta este fraza 2 pentru Amintiri din copilarie");
        frazeCarte3.add("Aceasta este fraza 3 pentru Amintiri din copilarie");
        frazeCarte3.add("Aceasta este fraza 4 pentru Amintiri din copilarie");

        List<String> frazeCarte4 = new ArrayList<>();
        frazeCarte4.add("Aceasta este fraza 1 pentru Baltagul");
        frazeCarte4.add("Aceasta este fraza 2 pentru Baltagul");
        frazeCarte4.add("Aceasta este fraza 3 pentru Baltagul");
        frazeCarte4.add("Aceasta este fraza 4 pentru Baltagul");
        frazeCarte4.add("Aceasta este fraza 5 pentru Baltagul");

        List<String> frazeCarte5 = new ArrayList<>();
        frazeCarte5.add("Aceasta este fraza 1 pentru Luceafrul");
        frazeCarte5.add("Aceasta este fraza 2 pentru Luceafrul");

        carti.add(new Carte("Mihai Eminescu", "Glossa", 100, "AfrazeCarte1"));
        carti.add(new Carte("Ioan Slavici", "Moara cu Noroc", 200, "bfrazeCarte2"));
        carti.add(new Carte("Ion Creanga", "Amintiri din copilarie", 304, "frazeCarte3"));
        carti.add(new Carte("Mihail Sadoveanu", "Baltagul", 400, "frazeCarte4"));
        carti.add(new Carte("Mihai Eminescu", "Luceafrul", 90, "frazeCarte5"));
    }

    public void afisareCarti() {
        // Sortăm lista de cărți în ordine alfabetică după autor și titlu
        Collections.sort(carti, new Comparator<Carte>() {

            public int compare(Carte carte1, Carte carte2) {
                // Comparăm mai întâi după autor
                int rezultat = carte1.getAutor().compareTo(carte2.getAutor());
                if (rezultat == 0) {
                    // Dacă autorii sunt identici, comparăm după titlu
                    rezultat = carte1.getTitlu().compareTo(carte2.getTitlu());
                }
                return rezultat;
            }
        });


        System.out.println("Cartile din biblioteca sunt:");
        for (Carte carte : carti) {
            System.out.println(carte);
        }
    }

    public void cautareFraza(String fraza, int pagina) {
        System.out.println("Rezultatele căutării pentru fraza " + fraza + " pe pagina " + pagina + " sunt:");

        for (Carte carte : carti) {
            if (carte.getPagini() >= pagina) { // Verificăm dacă cartea are suficiente pagini
                String continutPagina = carte.getContinutPagina(pagina);
                if (continutPagina != null && continutPagina.contains(fraza)) {
                    System.out.println(carte);
                }
            }
        }
    }

}
