import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> line = new LinkedList<>();

      
        line.add("Customer 1");
        line.add("Customer 2");
        line.add("Customer 3");

        System.out.println("Current Queue: " + line);

      
        String served = line.poll(); 
        System.out.println("Served: " + served);
        System.out.println("Next in line: " + line.peek());
    }
}