public class Ebook extends Publikacja {
    private TypyEbook typ;

    public static int licznikObiektow;

    public Ebook(String tytul, double cena) {
        super(tytul, cena);
    }

    public TypyEbook getTyp() {
        return typ;
    }

    public void setTyp(TypyEbook typ) {
        this.typ = typ;
    }

    public Ebook(String tytul, double cena, TypyEbook typ) {
        super(tytul, cena);
        this.typ = typ;
        licznikObiektow++;
    }

    @Override
    public String toString() {
        return "Ebook{" +
                "tytuł: "+getTytul()+
                "cena: "+ getCena()+
                "typ='" + typ + '\'' +
                '}';
    }
}
