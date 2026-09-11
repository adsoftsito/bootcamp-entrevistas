import java.util.HashSet;

public class Hash1 {
   
   public static void main (String argv[]) {
     HashSet<Integer> numbers = new HashSet<>();
     numbers.add(10); 
     numbers.add(20); 
     numbers.add(30); 
     numbers.add(40); 
     numbers.add(50); 
     System.out.println("hashSet contiene 40 ? " + numbers.contains(40));
   }
}
