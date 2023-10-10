package org.example;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.afisareCarti();
        biblioteca.cautareFraza("fraza",100);

//        for (Carte carte : rezultatCautare) {
//            System.out.println(carte.getTitlu() + " - " + carte.getAutor() + " - " + carte.getPagini() + " pagini");
    }
}


