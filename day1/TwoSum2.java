import java.util.HashMap;
import java.util.Map;
class TwoSum {
  protected int[] calcular(int[] nums, int target) {

     Map<Integer, Integer> map = new HashMap<>();

     for (int i=0; i < nums.length; i++) {
	  int complement = target - nums[i];   
         
	  if (map.containsKey(complement))  {
      	    return new int[]{ map.get(complement), i };
	  } 
          map.put(nums[i], i);
     }  
     return new int[]{-1, -1};
  }
}

public class TwoSum2 {
   public static void main (String argv[]) {
     TwoSum myCalc = new TwoSum();
     int[] nums = {2, 7, 11, 15};
     int target = 9;

     int[] result = myCalc.calcular(nums, target);
     System.out.println(result[0] + ", " + result[1]);
   }
}
