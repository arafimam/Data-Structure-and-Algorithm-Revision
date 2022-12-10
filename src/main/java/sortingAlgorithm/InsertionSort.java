package sortingAlgorithm;

public class InsertionSort {

    public int[] insertionSort (int[] nums){
        int startingIndex = 1;
        for (int i = startingIndex; i< nums.length; i ++){
            int firstElementOfTheUnsortedArray = nums[i];
            int indexOfLastElementOfSortedArray = i - 1;
            // compare with every element of the sorted part starting with the last element and swap every time
            while (indexOfLastElementOfSortedArray >= 0 &&
            firstElementOfTheUnsortedArray < nums[indexOfLastElementOfSortedArray]){
                int temp = nums[indexOfLastElementOfSortedArray];
                nums[indexOfLastElementOfSortedArray] = nums[indexOfLastElementOfSortedArray + 1];
                nums[indexOfLastElementOfSortedArray + 1] = temp;
                indexOfLastElementOfSortedArray --;
            }
        }
        return nums;
    }
}
