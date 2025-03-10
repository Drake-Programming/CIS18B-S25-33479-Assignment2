public class Book extends Item {
    private final String author;
    private final String ISBN;

    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }

    public Book(String title, int publicationYear, String author, String ISBN) {
        super(title, publicationYear);
        this.author = author;
        this.ISBN = ISBN;
    }
}
