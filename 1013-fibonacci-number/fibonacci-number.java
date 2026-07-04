class Solution {
    public int fib(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int i,a=0,b=1,s=0;
        for(i=2;i<=n;i++)
        {
            s=a+b;
            a=b;
            b=s;
        }
        return s;
    }
}