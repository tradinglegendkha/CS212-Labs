package Day11;
import java.util.Arrays;

public class Integers {
    public static void main(String[] args) {
        Integer[] nums = {2,7,11,15};
        System.out.println("---- For two sum ----");
        System.out.println("Indices that add up to the target: "+Arrays.toString(twoSum(nums, 9)));
        System.out.println("Numbers that add up to the target: "+Arrays.toString(twoSum(nums, 0)));
        System.out.println("Memory address: "+twoSum(nums, 9));

        System.out.println("---- For increment ----");
        System.out.println("The last digit increment is: "+Arrays.toString(increment(nums)));
        System.out.println("Memory address: "+increment(nums));

    }  
    
    public static int[] twoSum(Integer[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i]+nums[j]==target) {
                    return new int[]{i, j};
                }
                return new int[]{nums[i], nums[j]};
            }
        }
        return new int[]{0, 0};
    }
    public static int[] increment(Integer[] nums) {
        for(int i=0; i<nums.length; i++) {
            int lastNum = nums[nums.length-1];
            lastNum++;
            return new int[]{lastNum};   
        }
        return new int[]{0, 0};
    }
}
