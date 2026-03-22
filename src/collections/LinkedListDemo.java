import java.util.LinkedList;

/**
 * Note: Fast insertions/deletions and Queue-like behavior.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        
        LinkedList<String> tasks = new LinkedList<>();

        
        tasks.add("Write Code");
        tasks.add("Review PR");
        
        
        tasks.addFirst("Daily Standup");
        tasks.addLast("Submit Report");

        System.out.println("Current Task List: " + tasks);

        
        System.out.println("First Task: " + tasks.getFirst());
        System.out.println("Last Task: " + tasks.getLast());

        
        tasks.removeFirst();
        tasks.removeLast();

        tasks.push("Urgent Bug Fix"); 
        String nextTask = tasks.pop(); 
        System.out.println("Just popped: " + nextTask);

       
        System.out.println("\n--- Remaining Tasks ---");
        for (String task : tasks) {
            System.out.println("Pending: " + task);
        }
    }
}