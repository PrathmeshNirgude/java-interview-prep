import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

       
        deque.addLast("Back 1");
        deque.addLast("Back 2");

        deque.addFirst("Front 1");

        System.out.println("Deque: " + deque);

        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Removed from back: " + deque.removeLast());
    }
}