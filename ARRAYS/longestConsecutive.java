class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){return 0;}
        Arrays.sort(nums);
        int max=1;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                count++;
            }
            // max=count;
            else if (nums[i]!=nums[i-1]){count =1;}
            if(count>max){
                max=count;
            }
        }
        return max;
    }
}