package org.example;


public class Carte {
    private String autor;
    private String titlu;
    private int pagini;

    private String fraza;

    public Carte(String autor, String titlu, int pagini,String fraza){
        this.autor = autor;
        this.titlu = titlu;
        this.pagini = pagini;
        this.fraza =fraza;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public int getPagini() {
        return pagini;
    }

    public String getFraza(){
        return fraza;
    }
    @Override
    public String toString() {
        return "Titlu: " + titlu + ", Autor: " + autor + ", Pagini: " + pagini +",Fraza" + fraza;
    }


    public String getContinutPagina(int pagina) {
        return null;
    }
}