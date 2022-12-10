package sortingAlgorithm;

public class MergeSort {


    /**
     *
     * @param nums array to be sorted
     * @param low lowest index of the array
     * @param high highest index of the array
     */
    public static void mergeSort(int[] nums,int low,int high){
        if (low<high){
            int midpoint = (low+high)/2;
            mergeSort(nums,low,midpoint);
            mergeSort(nums,midpoint+1,high);


            // merge the sub-arrays
            merge(nums,low,midpoint,high);
        }
    }

    private static void merge(int[] nums,int low,int mid,int high){

        // find size of two sub-arrays
        int sizeOfLeftSubArray = (mid-low)+1;
        int sizeOfRightSubArray = (high-mid)-1;

        //create an array of size that combines to fit all element of the two sub arrays
        int[] result = new int[sizeOfLeftSubArray+sizeOfRightSubArray];
    }
}
