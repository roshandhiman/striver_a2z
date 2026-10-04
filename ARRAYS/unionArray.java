class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        TreeSet<Integer> a=new TreeSet<>();
        for(int val:nums1){
            a.add(val);
        }
        for(int val:nums2){
            a.add(val);
        }
        int[] arr=new int[a.size()];
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=a.get(i);
        // }
        int ind=0;
        for(int val:a){
            arr[ind]=val; 
            ind++;
        }
        return arr;
    }
}