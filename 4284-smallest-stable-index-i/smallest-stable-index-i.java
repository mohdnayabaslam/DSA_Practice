class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int i,j,len=nums.length;
        for(i=0;i<len;i++)
        {
            int min=nums[i];
            int max=nums[i];
            for(j=0;j<=i;j++)
            {
                max=Math.max(max,nums[j]);
            }
            for(j=i;j<len;j++)
            {
                min=Math.min(min,nums[j]);
            }
            if((max-min)<=k)
                return i;
            
        }
        return -1;
    }
}