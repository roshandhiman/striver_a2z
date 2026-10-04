class Solution {
    public int largestElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
}