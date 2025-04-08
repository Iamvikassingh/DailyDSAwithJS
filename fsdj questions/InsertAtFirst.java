import java.util.ArrayList;

public class InsertAtFirst {
    public static void main(String[] args) {
        // Creating an ArrayList and adding colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Inserting a color at the first position (index 0)
        colors.add(0, "Red");

        // Printing the list after insertion
        System.out.println("Updated Colors List: " + colors);
    }
}
