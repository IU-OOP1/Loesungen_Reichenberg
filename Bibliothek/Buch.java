public abstract class Buch {
    protected String titel;
    protected String autor;
    protected String isbn;

    public Buch(String titel, String autor, String isbn) {
        this.titel = titel;
        this.autor = autor;
        this.isbn = isbn;
    }

    abstract void ausleihen();

    abstract void zurueckgeben();

    @Override 
    public String toString() {
        return titel;
    }
}
