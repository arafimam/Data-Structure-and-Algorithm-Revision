package arrays;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        List<Integer> l1 = List.of(1,2,3);
        List<Integer> l2 = List.of(3,2,1);
        System.out.println(l2.equals(l1));

        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));

    }
    public static List<List<Integer>> threeSum(int[] nums) {

        // <nums[i],i>
        Map<Integer,Integer> valuesToIndex = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();


        // if there are any duplicate value in the array, map will hold:
        //<duplicate_value, highest_index>
        for (int i = 0; i< nums.length; i++){
            valuesToIndex.put(nums[i],i);
        }

        for (int i=0;i< nums.length;i++){
            int current_number = nums[i];
            // we need current_number + second_number + third_number = 0
            // we already know the current number
            // (second_number + third_number) = - current_number
            // we can get the second number by iterating the array again
            // then check the map to see if third_number exist in the map
            // ensure i,j and index of third_number are unique
            // ensure current_number, second_number and third_number is a unique set to the result.
            for (int j=0;j<nums.length;j++){
                int second_number = nums[j];
                int third_number = -current_number-second_number;
                if (valuesToIndex.containsKey(third_number)){
                    int indexOfThirdNumber = valuesToIndex.get(third_number);
                    if (i!=j && i!=indexOfThirdNumber && j!=indexOfThirdNumber){
                        // all indexes are unique
                        if (!verifyUniqueSet(result,current_number,second_number,third_number)){
                            result.add(List.of(current_number,second_number,third_number));
                        }
                    }
                }
            }
        }
        return result;
    }

    private static boolean verifyUniqueSet(List<List<Integer>> result,int a,int b, int c){
        return result.contains(List.of(a,b,c)) || result.contains(List.of(c,a,b)) || result.contains(List.of(c,b,a)) ||
                result.contains(List.of(b,a,c)) || result.contains(List.of(a,c,b)) || result.contains(List.of(b,c,a));
    }
}
