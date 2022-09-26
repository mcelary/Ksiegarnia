public abstract class Publikacja {
    //klasa abstrakcyjna- nie można tworzyć z niej obiektu, słózy tylko do dziedziczenia
    private String tytul;
    private double cena;

    public Publikacja(String tytul, double cena) {
        this.tytul = tytul;
        this.cena = cena;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }


}
