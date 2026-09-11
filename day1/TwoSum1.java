class TwoSum {

  protected int[] calcular(int[] nums, int target) {
     for (int i=0; i < nums.length; i++) {
       for (int j=0; j < nums.length; j++) {
          if (nums[i] + nums[j] == target) 
      	    return new int[]{i, j};
       }
     }  
     return new int[]{-1, -1};
  }

}

public class TwoSum1 {
       	
   public static void main (String argv[]) {
     TwoSum myCalc = new TwoSum();
     int[] nums = {2, 7, 11, 15};
     int target = 9;

     int[] result = myCalc.calcular(nums, target);
     System.out.println(result[0] + ", " + result[1]);
   }
}
