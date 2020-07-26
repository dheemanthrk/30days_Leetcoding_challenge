// Kadane's algorithm
class Solution {
    public int maxSubArray(int[] nums) {
        int maxc, maxg;
        maxc = maxg = nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i] > maxc+nums[i]){
                maxc = nums[i];
            }
            else{
                maxc = maxc + nums[i];
            }
            if(maxc>maxg) {
                maxg = maxc;
            }
        }
        return maxg;
    }
}