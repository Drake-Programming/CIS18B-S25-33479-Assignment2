public class Item {
    private final String title;
    private final int publicationYear;

    public String getTitle() { return title; }
    public int getPublicationYear() { return publicationYear; }

    public Item(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}
