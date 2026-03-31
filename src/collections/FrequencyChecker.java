import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyChecker {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 2, 5, 2);
        
       
        int count = Collections.frequency(numbers, 2);
        
        System.out.println("List: " + numbers);
        System.out.println("The number 2 appears " + count + " times.");
    }
}