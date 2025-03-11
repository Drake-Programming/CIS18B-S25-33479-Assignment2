import java.util.ArrayList;
import java.util.List;

/**
 * Singleton class representing a library containing a collection of items.
 */
public class Library {
    private List<Item> items = new ArrayList<>();

    private static volatile Library instance;

    /**
     * Private constructor to enforce Singleton pattern.
     */
    private Library() {}

    /**
     * Retrieves the single instance of the Library class using double-checked locking
     * for thread-safe lazy initialization.
     *
     * @return The singleton instance of the Library.
     */
    public static Library getInstance() {
        Library result = instance;
        if (result == null) {
            synchronized (Library.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Library();
                }
            }
        }
        return result;
    }

    /**
     * Adds a new item to the library's collection.
     *
     * @param item The item to be added.
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * Lists the titles of all available items in the library.
     * Prints a message if there are no available items.
     */
    public void listAvailableItems() {
        if (items.isEmpty()) {
            System.out.println("No available items");
        } else {
            System.out.println("Available items:");
            for (Item item : items) {
                System.out.println(item.getTitle());
            }
        }
    }

    /**
     * Finds and returns an item by its title.
     * Prints a message if the item is not found or the library is empty.
     *
     * @param title The title of the item to find.
     * @return The found item, or null if not found.
     */
    public Item findItemByTitle(String title) {
        if (items.isEmpty()) {
            System.out.println("No available items");
            return null;
        }

        for (Item item : items) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }

        System.out.println("Item " + title + " does not exist");
        return null;
    }
}
