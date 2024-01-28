
class Main {


    public static void main(String[] args) {

        var bib1 = new Bibliothek();
        var bib2 = new Bibliothek();

        var bibliothekarinBib1 = bib1.hire();
        var bibliothekarinBib2 = bib2.hire();

        var buchBib1No1 = bib1.addNewBook("Spaß mit programmieren Band 1", "Fabian R.", "ISBN-15-16");
        var buchBib1No2 = bib1.addNewBook("Spaß mit programmieren Band 2", "Fabian R.", "ISBN-15-17");
        var buchBib2No1 = bib2.addNewBook("Wer glaubt es?", "Fabian R.", "ISBN-15-18");

        //Erfolgreich bei Bib1 ausleihen
        bib1.ausleihen(bibliothekarinBib1, buchBib1No1);
        //Nicht erfolgreich bei Bib1 ausleihen, da Buch bereits ausgeliehtn
        bib1.ausleihen(bibliothekarinBib1, buchBib1No1);
        //Nicht erfolgreich bei Bib1 ausleihen, da Bibliothekarin nicht teil der Bib
        bib1.ausleihen(bibliothekarinBib2, buchBib1No2);
        //Nicht erfolgreich bei Bib1 ausleihen, da Buch nicht im Sortiment
        bib1.ausleihen(bibliothekarinBib1, buchBib2No1);

        //Erfolgreich zurückgeben
        bib1.zurueckgeben(bibliothekarinBib1, buchBib1No1);
        //Nicht erfolgreich zurückgeben, da Buch nicht ausgeliehen
        bib1.zurueckgeben(bibliothekarinBib1, buchBib1No1);

    }
}