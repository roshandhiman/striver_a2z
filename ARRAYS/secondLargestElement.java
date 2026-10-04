class Solution {
    public int secondLargestElement(int[] nums) {
        int max=nums[0];
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                smax=max;
                max=nums[i];
                // smax=max;
            }
            if(nums[i]>smax && nums[i]<max){
                smax=nums[i];
            }
        }
        if(Integer.MIN_VALUE==smax){return -1;}
        return smax;
    }
}