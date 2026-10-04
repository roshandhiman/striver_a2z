class Solution {
    public int linearSearch(int nums[], int target) {
		int i=-1;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==target){
                i=j;
                return i;

            }
        }
        return i;
    }
}