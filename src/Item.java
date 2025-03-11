/**
 * Represents a general item with a title and a publication year.
 */
public class Item {
    private final String title;
    private final int publicationYear;

    /**
     * Constructs an Item instance with the specified title and publication year.
     *
     * @param title The title of the item.
     * @param publicationYear The year the item was published.
     */
    public Item(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    /**
     * Gets the title of the item.
     *
     * @return The item's title.
     */
    public String getTitle() { return title; }

    /**
     * Gets the publication year of the item.
     *
     * @return The item's publication year.
     */
    public int getPublicationYear() { return publicationYear; }
}
