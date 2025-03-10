public class Magazine extends Item {
    private final int issueNumber;

    public int getIssueNumber() { return issueNumber; }

    public Magazine(String title, int publicationYear, int issueNumber) {
        super(title, publicationYear);
        this.issueNumber = issueNumber;
    }
}
