public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Mam książek: "+Ksiazka.licznikObiektu);
        Ksiazka ksiazka1 = new Ksiazka("Metro",20, 400);
        System.out.println(ksiazka1);
        System.out.println("Mam książek: "+Ksiazka.licznikObiektu);

        Ksiazka ksiazka2 = new Ksiazka("Wiedżmin", 30, 300);
        System.out.println("Mam książek: "+Ksiazka.licznikObiektu);
        Ebook ebook1 =new Ebook("Polly Anna",15,TypyEbook.pdf);
        System.out.println(ebook1);
        System.out.println("mam ebookow "+Ebook.licznikObiektow);
    }
}