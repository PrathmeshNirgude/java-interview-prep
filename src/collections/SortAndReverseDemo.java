import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAndReverseDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("Mango", "Apple", "Banana", "Cherry"));

        System.out.println("Original: " + fruits);

        
        Collections.sort(fruits);
        System.out.println("Sorted: " + fruits);

        
        Collections.reverse(fruits);
        System.out.println("Reversed: " + fruits);
    }
}