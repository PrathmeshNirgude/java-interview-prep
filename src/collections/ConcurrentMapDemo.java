import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class ConcurrentMapDemo {
    public static void main(String[] args) {
       
        Map<String, Integer> inventory = new ConcurrentHashMap<>();

        inventory.put("Java_Books", 50);
        inventory.put("Spring_Guides", 30);

        inventory.putIfAbsent("Java_Books", 100); 

        inventory.computeIfPresent("Spring_Guides", (key, val) -> val + 10);

        System.out.println("Inventory: " + inventory);
        
    }
}