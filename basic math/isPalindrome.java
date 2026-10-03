class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int rev=0;
        while(x!=0){
            int d=x%10;
            rev=rev*10+d;
            x/=10;
        }
        if(rev<0){
            return false;
        }
        else if(temp==rev){
            return true;
        }
        return false;
    }
}