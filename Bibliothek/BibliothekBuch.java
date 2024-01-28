public class BibliothekBuch extends Buch {
    //State um zu prüfen, ob ein Buch ausgeliehen ist oder nicht
    boolean isAusgeliehen = false;
    //Verweis auf die Bibliothek zu der das Buch gehört. Durch Call-By-Reference erfolgt eine eindeutige Zuweisung im Konstruktor
    Bibliothek bibliothek;
    public BibliothekBuch(Bibliothek bibliothek, String titel, String autor, String isbn) {
        super(titel, autor, isbn);
        this.bibliothek = bibliothek;
    }

    //Überschreibt die abstrakte Standard-Methode von Buch um den ausgeliehen Status zu setzen
    //Man könnte hier auch die Prüfung vornehmen, ob das Buch überhaupt ausgeliehen ist
    @Override
    void ausleihen() {
        isAusgeliehen = true;
        System.out.println(toString() + " erfolgreich ausgeliehen");
    }
    //Überschreibt die abstrakte Standard-Methode von Buch um den ausgeliehen Status zu setzen
    //Man könnte hier auch die Prüfung vornehmen, ob das Buch überhaupt ausgeliehen ist
    @Override
    void zurueckgeben() {
        isAusgeliehen = false;
        System.out.println(toString() + " erfolgreich zurückgegeben");
    }


}
