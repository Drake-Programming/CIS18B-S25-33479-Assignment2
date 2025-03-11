/**
 * Represents a book that can be borrowed. Inherits from Item and implements IBorrowable.
 */
public class Book extends Item implements IBorrowable {
    private final String author;
    private final String ISBN;
    private String borrower;

    /**
     * Constructs a Book instance with the specified title, publication year, author, and ISBN.
     *
     * @param title The title of the book.
     * @param publicationYear The year the book was published.
     * @param author The author of the book.
     * @param ISBN The ISBN of the book.
     */
    public Book(String title, int publicationYear, String author, String ISBN) {
        super(title, publicationYear);
        this.author = author;
        this.ISBN = ISBN;
        this.borrower = null;
    }

    /**
     * Gets the author of the book.
     *
     * @return The author of the book.
     */
    public String getAuthor() { return author; }

    /**
     * Gets the ISBN of the book.
     *
     * @return The ISBN of the book.
     */
    public String getISBN() { return ISBN; }

    /**
     * Marks the book as borrowed by the specified borrower.
     *
     * @param borrower The name of the person borrowing the book.
     */
    @Override
    public void borrowItem(String borrower) {
        if (this.borrower == null) {
            this.borrower = borrower;
        }
        else {
            System.out.println(getTitle() + " is already borrowed.");
        }
    }

    /**
     * Checks if the book is currently borrowed.
     *
     * @return True if the book is borrowed, false otherwise.
     */
    @Override
    public boolean isBorrowed() {
        return this.borrower != null;
    }

    /**
     * Returns the book, marking it as no longer borrowed.
     */
    @Override
    public void returnItem() {
        if (isBorrowed()) {
            this.borrower = null;
        } else {
            System.out.println(getTitle() + " is not borrowed.");
        }
    }
}
