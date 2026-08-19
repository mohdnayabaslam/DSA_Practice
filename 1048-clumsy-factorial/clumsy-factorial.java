class Solution {
    public int clumsy(int n) {
        int i,count=0,k,z=n,ans=0;
        for(i=n;i>1;i--)
        {
            k=count%4;
            switch(k)
            {
                case 0:
                    z=z*(i-1);
                    count++;
                    break;
                case 1:
                    z=z/(i-1);
                    count++;
                    break;
                case 2:
                    ans=ans+z;
                    z=i-1;
                    count++;
                    break;
                default:
                    ans=ans+z;
                    z=-(i-1);
                    count++;
            }
        }
        return z+ans;
    }
}