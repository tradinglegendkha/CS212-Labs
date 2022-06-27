package Day11;
import java.util.Arrays;

public class Integers {
    public static void main(String[] args) {
        Integer[] nums = {2,7,11,15};
        Integer[] nums2 = {3,2,4};
        //System.out.println(twoSum(nums, 9));
        System.out.println(Arrays.toString(twoSum(nums, 9)));
        System.out.println(Arrays.toString(twoSum(nums2, 6)));
        
    }  
    
    public static int[] twoSum(Integer[] nums, int target) {
        for(int i=0; i <nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i]+nums[j]==target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {0, 0};
    }
}
