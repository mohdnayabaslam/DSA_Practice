class Solution {
    public int[] applyOperations(int[] nums) {
        int i,len=nums.length;
        for(i=0;i<len-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]=2*nums[i];
                nums[i+1]=0;
            }
        }
        int k=0;
        for(i=0;i<len;i++)
        {
            if(nums[i]!=0)
            {
                nums[k]=nums[i];
                k++;
            }
        }
        for(i=k;i<=len-1;i++)
        {
            nums[i]=0;
        }
        return nums;
    }
}