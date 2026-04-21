/**
 * TicTacToe
 * UC4 converts a user-entered slot number (1-9) into corresponding
 * row and column indices of a 2D array.
 */
public class UC4 {

    /**
     * Entry point of the program.
     * Demonstrates slot-to-index conversion.
     */
    public static void main(String[] args) {
        int slot = 7;

        System.out.println("Row: " + getRowFromSlot(slot));
        System.out.println("Column: " + getColFromSlot(slot));
    }

    /**
     * Converts slot number into row index using zero-based indexing.
     * Formula: (slot - 1) / 3
     */
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    /**
     * Converts slot number into column index using modulo.
     * Formula: (slot - 1) % 3
     */
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}