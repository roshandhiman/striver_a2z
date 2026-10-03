class Solution {
    public int GCD(int n1, int n2) {
        return n2==0?n1 : GCD(n2,n1%n2);
    }
}