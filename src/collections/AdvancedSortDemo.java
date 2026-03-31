import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AdvancedSortDemo {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>(Arrays.asList(45, 99, 12, 78, 55));

        
        Collections.sort(scores, Collections.reverseOrder());

        System.out.println("High Scores (Descending): " + scores);
        
       
        System.out.println("Highest: " + Collections.max(scores));
        System.out.println("Lowest: " + Collections.min(scores));
    }
}