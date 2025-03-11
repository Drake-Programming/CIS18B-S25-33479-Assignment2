/**
 * Represents items that can be borrowed and returned.
 */
public interface IBorrowable {

    /**
     * Borrows the item and assigns it to the specified borrower.
     *
     * @param borrower The name of the person borrowing the item.
     */
    void borrowItem(String borrower);

    /**
     * Returns the borrowed item, marking it as available again.
     */
    void returnItem();

    /**
     * Checks whether the item is currently borrowed.
     *
     * @return true if the item is borrowed, false otherwise.
     */
    boolean isBorrowed();
}
