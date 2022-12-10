package sortingAlgorithm;

public class SelectionSort {

    public int[] selectionSort(int[] nums){
        for (int i=0;i< nums.length;i++){
            // find minimum element from index 'i' to end of array.
            int indexOfMin = findIndexOfMin(i,nums);
            //swap min with sorted array.
            int temp = nums[indexOfMin];
            nums[indexOfMin] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }

    private int findIndexOfMin(int startingIndex, int[] array){
        int indexOfMin = startingIndex;
        int min = Integer.MAX_VALUE;
        for (int i = startingIndex;i<array.length; i ++){
            if (array[i] < min){
                min = array[i];
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }
}
