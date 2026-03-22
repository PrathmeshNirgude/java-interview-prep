import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListDemo{
    public static void main(String[] args) {

        List<String> techStack = new ArrayList<>();

        techStack.add("Java");
        techStack.add("Spring Boot");
        techStack.add("AWS");
        techStack.add("Microservices");

     
        System.out.println("Initial Stack: " + techStack);
        System.out.println("Element at index 1: " + techStack.get(1));
        
        techStack.set(2, "Cloud Computing"); 
        

        techStack.remove("Microservices"); 
        techStack.remove(0); 

   
        System.out.println("Size of list: " + techStack.size());
        System.out.println("Contains 'Spring Boot'? " + techStack.contains("Spring Boot"));

   
        Collections.sort(techStack);
        
     
        System.out.println("\n--- Final Tech Stack ---");
        for (String tech : techStack) {
            System.out.println(">> " + tech);
        }

      
        techStack.clear();
        System.out.println("\nList cleared. Is empty? " + techStack.isEmpty());
    }
}