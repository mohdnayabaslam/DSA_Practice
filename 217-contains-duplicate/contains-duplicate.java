class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int i,len=nums.length;
        for(i=0;i<len;i++)
        {
            if(hs.contains(nums[i]))
                return true;
            else
                hs.add(nums[i]);
        }
        return false;
    }
}