public class LibraryItemFactory {
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
