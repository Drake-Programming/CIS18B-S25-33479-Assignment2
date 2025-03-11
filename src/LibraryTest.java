/**
 * Demonstrates usage of the Library, LibraryItemFactory, and related classes.
 */
public class LibraryTest {
    // Run this script first
    public static void main(String[] args) {
        // Instantiate the factory for creating library items
        LibraryItemFactory factory = new LibraryItemFactory();

        // Create books and magazines using the factory
        Item book1 = factory.createItem("book", "Book One", 1999, "Meghan Marlow", "ISBN1234567890");
        Item book2 = factory.createItem("book", "Book Two", 2007, "John Doe", "ISBN12345");
        Item magazine1 = factory.createItem("magazine", "Magazine One", 2015, "4963456");

        // Obtain singleton instance of Library
        Library library = Library.getInstance();

        // Add items to library
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(magazine1);

        // List all available items in the library
        library.listAvailableItems();

        // Search for items by title and print the results
        System.out.println(library.findItemByTitle("Book Two"));
        System.out.println(library.findItemByTitle("Nonexistent Book"));
    }
}
