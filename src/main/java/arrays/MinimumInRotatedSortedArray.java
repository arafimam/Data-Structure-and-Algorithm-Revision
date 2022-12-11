package arrays;

public class MinimumInRotatedSortedArray {

    // we can solve the problem using a linear search to find the minimum Element in the array.
    // For a logn search we can do binary search
    public int findMin(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }

        int left = 0;
        int right = nums.length -1;

        // array is not rotated
        if (nums[right] > nums[0]){
            return nums[0];
        }

        while (right >=  left){
            int mid = left +(right - left)/2;
            if (nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }
            if (nums[mid] < nums[mid-1]){
                return nums[mid];
            }

            if (nums[mid] > nums[0]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return 0;

    }
}
