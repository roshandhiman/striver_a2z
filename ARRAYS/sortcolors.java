class Solution {
    public void sortColors(int[] nums) {
        // Arrays.sort(nums);
        int c0=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c0++;
            }
            else if(nums[i]==1){
                c1++;
            }
            else if(nums[i]==2){
                c2++;
            }
        }
        int ind=0;
        while(c0>0){
            nums[ind]=0;
            ind++;
            c0--;
        }
        while(c1>0){
            nums[ind]=1;
            ind++;
            c1--;
        }
        while(c2>0){
            nums[ind]=2;
            ind++;
            c2--;
        }
    }
}