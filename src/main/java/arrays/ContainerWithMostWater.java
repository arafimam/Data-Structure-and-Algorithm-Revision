package arrays;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {

        // area = difference between index * Min (num[i2],num[i1])
        int maxarea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int width = right - left;
            maxarea = Math.max(maxarea, Math.min(height[left], height[right]) * width);
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxarea;

    }
}
