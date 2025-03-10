public abstract class LibraryItemFactory {
    public Item createItem(String type, String title, int publicationYear, String... extraData) {
        if (type.equals("book")) {
            return createBook(title, publicationYear, extraData);
        }
        else if (type.equals("magazine")) {
            return createMagazine(title, publicationYear, extraData);
        }
        else {
            System.out.println("Unsupported type: " + type);
            return null;
        }
    }

    private Item createBook(String title, int publicationYear, String... extraData) {
        try {
            String author = extraData[0];
            String ISBN = extraData[1];
            return new Book(title, publicationYear, author, ISBN);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return null;
    }

    private Item createMagazine(String title, int publicationYear, String... extraData) {
        try {
            int issueNumber = Integer.parseInt(extraData[0]);
            return new Magazine(title, publicationYear, issueNumber);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return null;
    }
}
