package arrays;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{0,0,0}));
    }
    public static List<List<Integer>> threeSum(int[] nums) {

        Map<Integer,Integer> valuesToIndex = new HashMap<>();
        Set<Integer> resultingIndex = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        // store all numbers to their corresponding index.
        for (int i=0;i<nums.length;i++){
            valuesToIndex.put(nums[i],i);
        }

        for (int i=0;i<nums.length;i++){
            int current_number = nums[i];
            valuesToIndex.put(current_number,i);
            // check if there are two other numbers which add up to the negative of current_number
            // (x+y) = -current_number
            for (int j=0;j<nums.length;j++){
                if (j!=i){
                    int x = nums[j];
                    int y = -current_number-x;
                    // make sure index of current_number,x and y are unique
                    // index of current_number and x will never be the same.
                    if (valuesToIndex.containsKey(y)){
                        if (valuesToIndex.get(y) != valuesToIndex.get(current_number) &&
                            valuesToIndex.get(x) !=  valuesToIndex.get(y)
                        ){
                            if (!resultingIndex.contains(current_number) || !resultingIndex.contains(x) ||
                                    !resultingIndex.contains(y)){
                                result.add(List.of(current_number,x,y));
                                resultingIndex.add(current_number);
                                resultingIndex.add(x);
                                resultingIndex.add(y);
                            }
                        }

                    }
                }
            }
        }
        return result;

    }
}
