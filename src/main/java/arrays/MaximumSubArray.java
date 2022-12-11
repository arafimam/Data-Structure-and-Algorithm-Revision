package arrays;

public class MaximumSubArray {

    public static void main(String[] args) {
        System.out.println(optimizedSolution(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public int maxSubArray(int[] nums) {
        return optimizedSolution(nums);
    }

    // kadanes algorithm
    private static int optimizedSolution(int[] nums){
        int current_sum = nums[0];
        int best_sum = nums[0];
        for (int i=1;i< nums.length;i++){
            // current_sum holds the running sum of the current sub_array
            current_sum = Math.max(nums[i],current_sum+nums[i]);
            best_sum = Math.max(best_sum,current_sum);
        }
        return best_sum;


    }

    // Time complexity: O(n^2), leads to time limit exceeded for big data
    private static int firstSolution(int[] nums){
        int maxOfAllSubArrays = Integer.MIN_VALUE;
        for (int i = 0;i < nums.length; i++){
            int maxOfSubArrayStartingWithElementI = Integer.MIN_VALUE;
            int sum = 0;
            for (int j=i;j< nums.length;j++){
                sum = sum + nums[j];
                if (sum > maxOfSubArrayStartingWithElementI){
                    maxOfSubArrayStartingWithElementI = sum;
                }
            }
            if (maxOfSubArrayStartingWithElementI > maxOfAllSubArrays){
                maxOfAllSubArrays = maxOfSubArrayStartingWithElementI;
            }
        }
        return maxOfAllSubArrays;
    }
}
