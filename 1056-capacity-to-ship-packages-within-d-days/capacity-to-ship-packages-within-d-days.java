class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int i,len=weights.length;
        int low=weights[0],high=0,mid;
        for(i=0;i<len;i++)
        {
            high=high+weights[i];
            if(low<weights[i])
            {
                low=weights[i];
            }
        }
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(canship(weights,days,mid))
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
    static boolean canship(int weights[],int days,int mid)
    {
        int i,d,currentsum=0,reqdays=1;
        for(i=0;i<weights.length;i++)
        {
            if(currentsum+weights[i]<=mid)
            {
                currentsum=currentsum+weights[i];
            }
            else
            {
                reqdays++;
                currentsum=weights[i];
            }
        }
        if(reqdays<=days)
            return true;
        else
            return false;
    }
}