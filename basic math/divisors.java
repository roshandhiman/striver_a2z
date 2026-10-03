class Solution {
    public int[] divisors(int n) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                a.add(i);
            }
        }
        int[] arr=new int[a.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=a.get(i);
        }
        return arr;
    }
}