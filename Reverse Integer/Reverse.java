class Solution {
    public int reverse(int x) {
        int nu = 0;
        while(x != 0){
            int end = x % 10;
            if (nu > Integer.MAX_VALUE/10 || nu < Integer.MIN_VALUE/10)
                return 0;
            nu = nu*10 + end;
            x /= 10;
        }
        return nu;
    }
}