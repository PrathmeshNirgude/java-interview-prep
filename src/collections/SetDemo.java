import java.util.HashSet;
import java.util.Set;


public class SetDemo {
    public static void main(String[] args) {
        Set<String> userIDs = new HashSet<>();

        userIDs.add("USER_101");
        userIDs.add("USER_102");
        userIDs.add("USER_103");

        boolean isAdded = userIDs.add("USER_101"); 
        System.out.println("Was duplicate USER_101 added? " + isAdded); // Returns false

        System.out.println("Total Unique Users: " + userIDs.size());
        System.out.println("Does USER_102 exist? " + userIDs.contains("USER_102"));

        userIDs.remove("USER_103");

        System.out.println("\n--- Current Users in Set ---");
        for (String id : userIDs) {
            System.out.println("ID: " + id);
        }

        userIDs.clear();
        System.out.println("\nSet cleared. Current size: " + userIDs.size());
    }
}