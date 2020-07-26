class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxc = maxg = nums[0]
        for i in range(1,len(nums)):
            maxc = max(nums[i], maxc+nums[i])
            if(maxc>maxg):
                maxg = maxc
        return maxg