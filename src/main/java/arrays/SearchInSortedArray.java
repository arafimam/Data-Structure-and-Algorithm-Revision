package arrays;

public class SearchInSortedArray {

    // this problem can be solved using linear search approach which is O(n)
    // we need to do binary search with some other conditions.
    public  int search(int[] nums, int target) {
        if (nums.length == 1){
            if (nums[0] == target) {
                return 0;
            }
            else{
                return -1;
            }
        }

        // for not-rotated array.
        if (nums[nums.length-1]>nums[0]){
            return findTargetInNotRotatedArray(nums,target,0, nums.length-1);
        }

        // thinking about array that is rotated.
        // we know the array is rotated because: nums[size-1] < nums[0]
        // a rotated array has a trend: [increases > decrease > increase]
        // basically: [x ,increases > max_value > min_value > increases, y]
        // find the point of inflection (point where value changes from max to min
        // Let's consider point of inflection = y (max_value)
        // if target is withing nums[low] -- nums[y] then check left side
        // otherwise, check right side.
        // once we know which side to check we can just do simple binary search
        int pointOfInflection = findPointOfInflectionInRotatedArray(nums,target);
        if (nums[pointOfInflection] == target){
            return pointOfInflection;
        }

        if (target >= nums[0] && target < nums[pointOfInflection]){
            // left side of the point of inflection
            return findTargetInNotRotatedArray(nums,target,0,pointOfInflection-1);
        }
        else{
            //right side of the point of inflection
            int midPoint = (nums.length-1)/2;
            return findTargetInNotRotatedArray(nums,target,pointOfInflection+1,nums.length);
        }
    }

    // Binary Search: O(logn)
    private int findPointOfInflectionInRotatedArray(int[] nums,int target){
        int low = 0;
        int high = nums.length - 1;
        while (high >= low){
            int mid = low + (high-low)/2;
            if (nums[mid] > nums[mid+1]){
                // returning the index of the max value.
                return mid;
            }
            if (nums[mid-1] > nums[mid]){
                return mid-1;
            }
            if (nums[mid] > nums[0]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }

    // Binary Search so: O(logn)
    private int findTargetInNotRotatedArray(int[] nums,int target,int lowBound,int highBound){
        int low = lowBound;
        int high = highBound;
        while (high >= low){
            int mid = low + (high - low)/2;
            if (nums[mid] == target){
                return mid;
            }
            if (target > nums[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        // element not find
        return -1;
    }
}
