class Solution {
    public boolean checkDivisibility(int n) {
        int product=1,sum=0,k=n;
        while(k>0)
        {
            int r=k%10;
            k=k/10;
            sum=sum+r;
            product=product*r;
        }
        if(n%(sum+product)==0)
            return true;
        return false;
    }
}