import java.util.TreeMap;


public class TreeMapDemo {
    public static void main(String[] args) {
       
        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(103, "Prathmesh");
        students.put(101, "Amit");
        students.put(105, "Rahul");
        students.put(102, "Suresh");

        System.out.println("Sorted Students: " + students);

        System.out.println("First Student ID: " + students.firstKey());
        System.out.println("Last Student ID: " + students.lastKey());
      
    
        System.out.println("Highest ID below 104: " + students.lowerKey(104));
    }
}