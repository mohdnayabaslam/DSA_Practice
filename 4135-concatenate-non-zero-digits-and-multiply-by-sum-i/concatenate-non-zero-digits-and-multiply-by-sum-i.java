class Solution {
    public long sumAndMultiply(int n) {
        int i,r,sum=0,place=1,num=0;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            if(r!=0)
            {
                num=num+(r*place);
                place=place*10;
            }
            n=n/10;
        }
        return (long)num*sum;        
    }
}