import java.util.HashMap;

public class Hash2 {
   
   public static void main (String argv[]) {
     HashMap<Integer, String> users = new HashMap<>();
     users.put(101, "adsoft"); 
     users.put(102, "maria"); 
     users.put(103, "carlos"); 
     // Acceder a un valor usando su clave
     System.out.println("Valor clave 102: " + users.get(102));
     System.out.println("hashMap contiene 103 ? " + users.containsKey(103));
   }
}
