class Solution {
    public int removeDuplicates(int[] nums) {
        int i,len=nums.length,k=2;
        for(i=2;i<len;i++)
        {
            if(nums[i]!=nums[k-2])
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}