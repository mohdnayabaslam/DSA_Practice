class Solution {
    public int smallestIndex(int[] nums) {
        int i,len=nums.length;
        for(i=0;i<len;i++)
        {
            if(nums[i]<=9)
            {
                if(nums[i]==i)
                    return i;             
            }
            else
            {
                int k=sum(nums[i]);
                {
                    if(i==k)
                        return i;
                }
            }
        }
        return -1;
    }
    static int sum(int n)
    {
        int s=0;
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            s=s+r;
        }
        return s;
    }
}