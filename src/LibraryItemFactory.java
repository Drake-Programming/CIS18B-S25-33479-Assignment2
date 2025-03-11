/**
 * Factory class responsible for creating various library items.
 */
public class LibraryItemFactory {

    /**
     * Creates and returns a library item of the specified type.
     *
     * @param type The type of item to create ("book" or "magazine").
     * @param title The title of the item.
     * @param publicationYear The year the item was published.
     * @param extraData Additional data required based on item type:
     *                  - For "book": [author, ISBN]
     *                  - For "magazine": [issueNumber]
     * @return The created Item instance, or null if type is unrecognized.
     * @throws IllegalArgumentException If the provided extraData does not match the expected length.
     */
    public Item createItem(String type, String title, int publicationYear, String... extraData) {
        switch (type) {
            case "book":
                if (extraData.length != 2) {
                    throw new IllegalArgumentException("Extra data length must be 2");
                }
                return new Book(title, publicationYear, extraData[0], extraData[1]);
            case "magazine":
                if (extraData.length != 1) {
                    throw new IllegalArgumentException("Extra data length must be 1");
                }
                return new Magazine(title, publicationYear, Integer.parseInt(extraData[0]));
            default:
                System.out.println("Unknown library item type: " + type);
        }
        return null;
    }
}
