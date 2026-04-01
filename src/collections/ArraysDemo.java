import java.util.Arrays;


public class ArraysDemo {

    public static void main(String[] args) {
        
        int[] numbers = {42, 7, 15, 89, 3, 22};
        System.out.println("Original: " + Arrays.toString(numbers));
        
        Arrays.sort(numbers);
        System.out.println("Sorted:   " + Arrays.toString(numbers));
        System.out.println("---");

        int target = 22;
        int index = Arrays.binarySearch(numbers, target);
        
        if (index >= 0) {
            System.out.println("Value " + target + " found at index: " + index);
        } else {
            System.out.println("Value not found.");
        }
        System.out.println("---");

        int[] scores = new int[5];
        Arrays.fill(scores, 100); 
        System.out.println("Filled Array: " + Arrays.toString(scores));
        
        Arrays.fill(scores, 1, 4, 50);
        System.out.println("Partially Re-filled: " + Arrays.toString(scores));
    }
}