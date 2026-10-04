class Solution {
    public int singleNumber(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i].indexOf==nums[i].lastIndexOf){
        //         return nums[i];
        //     }
        // }
        // return -1;
        int ans=0;
        for(int a:nums){
            ans=ans^a;
        }
        return ans;
    }
}