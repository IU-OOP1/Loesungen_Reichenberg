import java.util.ArrayList;
import java.util.List;

public class Bibliothek {
    public List<Bibliothekarin> personal = new ArrayList<>();
    public List<BibliothekBuch> buecher = new ArrayList<>();

    //Fragt an ob über die Bibliothekarin ein bestimmtes BibliothekBuch ausgeliehen werden kann.
    //1. Prüfen ob die Bibliothekarin für die Bibliothek arbeitet und ob das BibliothekBuch in der Bibliothek existiert
    //2. Über den Stream auf die Liste zugreifen um direkt nach dem Buch zu filtern und zu prüfen ob eine Kopie vorhanden ist,
    //      bei der der Ausgeliehen Status false ist. Aus dem Stream lassen wir uns den ersten Eintrag zurückgeben. Sollte
    //      kein Eintrag mit dem filter gefunden werden, wird eine Exception (NoSuchElementException) geworfen und wir kommen in den
    //      catch-Part. Ansonsten wir die ausleih-Methode vom Buch aufgerufen
    public void ausleihen(Bibliothekarin bibliothekarin, BibliothekBuch buch) {
        if(personal.contains(bibliothekarin) && buecher.contains(buch)) {
            try {
                var buchZumAusleihen = buecher
                                            .stream()
                                            .filter(b -> b == buch && !b.isAusgeliehen)
                                            .findFirst()
                                            .get();
                buchZumAusleihen.ausleihen();
            } catch(Exception ex) {
                System.out.println("Buch nicht gefunden oder bereits ausgeliehen");
            }
        } else {
            System.out.println("Buch nicht gefunden oder Bibliothekarin arbeitet nicht für die Bibliothek");
        }
    }

    //Gleiches vorgehen wie ausleihen, nur das diesmal geprüft wird ob das Buch, dass zurückgegeben werden soll, 
    //auch wirklich ausgeliehen ist.
    public void zurueckgeben(Bibliothekarin bibliothekarin, BibliothekBuch buch) {
        if(personal.contains(bibliothekarin) && buecher.contains(buch)) {
            try {
                var buchZumZurueckgeben = buecher
                                            .stream()
                                            .filter(b -> b == buch && b.isAusgeliehen)
                                            .findFirst()
                                            .get();
                buchZumZurueckgeben.zurueckgeben();
            } catch(Exception ex) {
                System.out.println("Buch nicht gefunden oder noch nicht ausgeliehen");
            }
        } else {
            System.out.println("Buch nicht gefunden oder Bibliothekarin arbeitet nicht für die Bibliothek");
        }
    }

    //Hilfsmethode um ein neues BibliothekBuch in der Bibliothek anzulegen
    public BibliothekBuch addNewBook(String titel, String autor, String isbn) {
        var newBook = new BibliothekBuch(this, titel, autor, isbn);
        buecher.add(newBook);
        return newBook;
    }
    //Hilfsmethode um eine neue Bibliothekarin einzustellen
    public Bibliothekarin hire() {
        var newPersonal = new Bibliothekarin();
        personal.add(newPersonal);
        return newPersonal;
    }
}
