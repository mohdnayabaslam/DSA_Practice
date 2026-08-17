class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int len=piles.length;
        Arrays.sort(piles);
        int low=1,high=piles[len-1],mid;
        while(low<=high)
        { 
            mid=low+(high-low)/2;
            if(caneat(mid,h,piles))
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
    static boolean caneat(int mid,int h,int piles[])
    {
        long hours=0;
        for(int i=0;i<piles.length;i++)
        {
            hours=hours+(long)Math.ceil((double)piles[i]/mid);
        }
        if(hours<=h)
            return true;
        else
            return false;
        
    }
}