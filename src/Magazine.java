/**
 * Represents a magazine item with a specific issue number.
 */
public class Magazine extends Item {
    private final int issueNumber;

    /**
     * Constructs a Magazine instance with the specified title, publication year, and issue number.
     *
     * @param title The title of the magazine.
     * @param publicationYear The year the magazine was published.
     * @param issueNumber The issue number of the magazine.
     */
    public Magazine(String title, int publicationYear, int issueNumber) {
        super(title, publicationYear);
        this.issueNumber = issueNumber;
    }

    /**
     * Gets the issue number of the magazine.
     *
     * @return The magazine's issue number.
     */
    public int getIssueNumber() {
        return issueNumber;
    }
}
