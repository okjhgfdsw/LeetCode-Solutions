//here simple check karna tha array sorted hai ki nahi
//additional rotate wala concept hai kaise hoga ye nahi pucha 
//Q 1752
//simple count this arr[i]>arr[i+1%arr.length] if it is count<=1 then true 
//other wise false


class Solution {
    public boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
               count++;
            }
           
        } if(count<=1){
            return true;
        }return false;
    }
}
