import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Item> items = new ArrayList<>();

    private static volatile Library instance;

    private Library() {}

    public static Library getInstance() {
        // Use local variable to not read instance from main memory and improve performance
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

    public void addItem(Item item) {
        items.add(item);
    }

    public void listAvailableItems() {
        // Check if items list is empty
        if (items.isEmpty()) {
            System.out.println("No available items");
        } else {
            // Print out item titles
            System.out.println("Available items:");
            for (Item item : items) {
                System.out.println(item.getTitle());
            }
        }
    }

    public Item findItemByTitle(String title) {
        // Check if items list is empty
        if (items.isEmpty()) {
            System.out.println("No available items");
            return null;
        }

        // Check if item title matches input title
        for (Item item : items) {
            if (item.getTitle().equals(title)) {
                return item;
            } else {
                System.out.println("Item " + title+ " does not exist");
            }
        }
        return null;
    }
}
