class Solution {
    public int longestConsecutive(int[] nums) {
        int i,len=nums.length,ans=0;
        HashSet<Integer> hs = new HashSet<>();
        for(i=0;i<len;i++)
        {
            hs.add(nums[i]);
        }
        for(int x : hs)
        {
            if(!hs.contains(x-1))
            {
                int curr=x;
                len=1;
                while(hs.contains(curr+1))
                {
                    curr++;
                    len++;
                }
                ans=Math.max(ans,len);
            }
        }
        return ans;
    }
}