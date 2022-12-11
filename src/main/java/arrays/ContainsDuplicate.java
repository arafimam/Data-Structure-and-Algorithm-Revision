package arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int i = 0; i < nums.length; i ++){
            if (!uniqueElements.contains(nums[i])){
                uniqueElements.add(nums[i]);
            }else {
                return true;
            }
        }
        return false;
    }

}
