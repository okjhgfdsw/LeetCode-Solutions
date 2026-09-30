// Example 1:

// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
// Example 2:

// Input: nums = [1,1,1,1,1]
// Output: [1,2,3,4,5]
// Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        for(int i=0;i<=nums.length-1;i++){
            sum=sum+nums[i];
            nums[i]=sum;
        }return nums;

    }
}
