public class Ksiazka extends Publikacja {
    private int liczbastron;

    public static int licznikObiektu;

    public Ksiazka(String tytul, double cena) {
        super(tytul, cena);

    }

    public Ksiazka(String tytul, double cena, int liczbastron) {
        super(tytul, cena);
        this.liczbastron = liczbastron;
        licznikObiektu++;
    }

    public int getLiczbastron() {
        return liczbastron;
    }

    public void setLiczbastron(int liczbastron) {
        this.liczbastron = liczbastron;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul: " + getTytul()+
                "cena: " + getCena()+
                "liczbastron=" + liczbastron +
                '}';
    }
}
