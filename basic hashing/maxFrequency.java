class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        // int r=0;
        long sum=0;
        long ans=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            long cost=(long) nums[r]*(r-l+1)-sum;
            while(cost>k){
                sum-=nums[l];
                l++;
                cost=(long) nums[r]*(r-l+1)-sum;
            }
            ans=Math.max(ans,(r-l+1));
        }
        return (int) ans;
    }
}