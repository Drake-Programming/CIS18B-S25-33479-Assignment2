public class LibraryTest {
    public static void main(String[] args) {
        LibraryItemFactory factory = new LibraryItemFactory();

        Item book1 = factory.createItem("book", "Book One", 1997, "Me", "GOB3456");
        Item book2 = factory.createItem("book", "Book Two", 2003, "You", "GOB8495");
        Item magazine1 = factory.createItem("magazine", "Magazine One", 2015,"4963456");

        Library library = Library.getInstance();

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(magazine1);

        library.listAvailableItems();

        System.out.println(library.findItemByTitle("Book One"));
        System.out.println(library.findItemByTitle("Book None"));
    }
}
