class Solution {
    public int reverse(int x) {
        long rev=0;
        // int max=Integer.MAX_VALUE;
        // int min=Integer.MIN_VALUE;
        while(x!=0){
            int d=x%10;
            rev=rev*10+d;
            x/=10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        return (int)rev;
    }
}