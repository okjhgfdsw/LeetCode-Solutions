//key logic we learn from here
//we can initiate i variable many time in for loop
//if you initiate any variable in for or while loop it not affect 
//to you ans which you return because it internally initiated many time
//for continuty update initialize variable universally
//also understand the use of temp variabele

class Solution {
    public int findNumbers(int[] nums) {
        int res=0;
        for(int i=0;i<=nums.length-1;i++){
            int count=0;
            int temp=nums[i];
            while(temp>0){
                temp=temp/10;
            count++;
            }
            if(count%2==0){
                res++;
            }
        }return res;
    }
}
