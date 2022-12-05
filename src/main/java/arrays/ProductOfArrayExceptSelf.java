package arrays;

public class ProductOfArrayExceptSelf {


    public int[] productExceptSelf(int[] nums) {
        int answer[] = new int[nums.length];

        int foundZero = 0;

        // find product
        int product = 1;
        for (int i=0;i< nums.length;i++){
            if (nums[i] != 0){
                product = product * nums[i];
            }else{
                foundZero++;
            }
        }

        for (int j=0;j<nums.length;j++){
            if (nums[j] != 0 && foundZero>=1){
                answer[j] = 0;
            }
            else if (nums[j] == 0 && foundZero >=2){
                answer[j] = 0;
            }
            else if (nums[j] == 0 && foundZero<=1){
                answer[j] = product;
            }
            else{
                answer[j] = product / nums[j];
            }

        }
        return answer;
    }
}
