import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListDemo{
    public static void main(String[] args) {
        // 1. Initialization (Using List interface for flexibility)
        List<String> techStack = new ArrayList<>();

        // 2. Adding elements
        techStack.add("Java");
        techStack.add("Spring Boot");
        techStack.add("AWS");
        techStack.add("Microservices");

        // 3. Accessing and Modifying
        System.out.println("Initial Stack: " + techStack);
        System.out.println("Element at index 1: " + techStack.get(1));
        
        techStack.set(2, "Cloud Computing"); // Updates "AWS" to "Cloud Computing"

        // 4. Removing elements
        techStack.remove("Microservices"); // By object
        techStack.remove(0); // By index (removes "Java")

        // 5. Common Utility Operations
        System.out.println("Size of list: " + techStack.size());
        System.out.println("Contains 'Spring Boot'? " + techStack.contains("Spring Boot"));

        // 6. Sorting (Alphabetical)
        Collections.sort(techStack);
        
        // 7. Iterating through the list
        System.out.println("\n--- Final Tech Stack ---");
        for (String tech : techStack) {
            System.out.println(">> " + tech);
        }

        // 8. Clearing the list
        techStack.clear();
        System.out.println("\nList cleared. Is empty? " + techStack.isEmpty());
    }
}