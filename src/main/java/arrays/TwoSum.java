package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * https://leetcode.com/problems/two-sum/
     * @param nums
     * @return
     */
    public static int[] twoSum(int[] nums,int target){
        // map to store [values -> index]
        Map<Integer,Integer> valueToIndexMap = new HashMap<>();
        for (int i=0;i< nums.length;i++){
            valueToIndexMap.put(nums[i],i);
        }
        for (int j=0;j< nums.length;j++){
            int difference = target - nums[j];
            if (valueToIndexMap.containsKey(difference)){
                // ensure that the value is not the same element
                if (valueToIndexMap.get(difference) != j){
                    return new int[]{j,valueToIndexMap.get(difference)};
                }

            }
        }
        return null;
    }


}
