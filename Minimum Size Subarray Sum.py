class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        sum1 = 0    
        s = 0
        minSize = len(nums) + 1
        for i in range(len(nums)):
            sum1 += nums[i]
            while sum1 >= target:
                minSize = min(minSize, i - s + 1)
                sum1 -= nums[s]
                s += 1

        if minSize != len(nums)+1:
            return minSize
        else:
            return 0
            
        