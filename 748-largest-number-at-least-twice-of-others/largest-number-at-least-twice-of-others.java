class Solution {
    public int dominantIndex(int[] nums) {
        int i,len=nums.length,biggest=nums[0],bindex=0;
        for(i=0;i<len;i++)
        {
            if(nums[i]>biggest)
            {
                biggest=nums[i];
                bindex=i;
            }
        }
        Arrays.sort(nums);
        if(2*(nums[len-2])<=biggest)
            return bindex;
        return -1;
    }
}