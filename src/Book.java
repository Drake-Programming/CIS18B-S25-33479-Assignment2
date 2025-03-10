public class Book extends Item implements IBorrowable {
    private final String author;
    private final String ISBN;
    private String borrower;

    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }

    public Book(String title, int publicationYear, String author, String ISBN) {
        super(title, publicationYear);
        this.author = author;
        this.ISBN = ISBN;
        this.borrower = null;
    }

    @Override
    public void borrowItem(String borrower) {
        if (this.borrower == null) {
            this.borrower = borrower;
        }
        else {
            System.out.println(getTitle() + " is already borrowed.");
        }
    }

    @Override
    public boolean isBorrowed() {
        return this.borrower != null;
    }

    @Override
    public void returnItem() {
        if (isBorrowed()) {
            this.borrower = null;
        } else {
            System.out.println(getTitle() + " is not borrowed.");
        }
    }
}
