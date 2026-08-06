class Solution {
    public int smallestNumber(int n, int t) {
        while(true)
        {
            if((product(n))%t==0)
                return n;
            else
                n++;
        }
    }
    static int product(int n)
    {
        int s=1;
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            s=s*r;
        }
        return s;
    }
}