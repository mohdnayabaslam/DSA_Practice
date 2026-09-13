class Solution {
    public int firstMissingPositive(int[] nums) {
        int i,len=nums.length,k=1;
        HashSet<Integer> set = new HashSet<>();
        for(i=0;i<len;i++)
        {
            set.add(nums[i]);
        }
        while(true)
        {
            if(!set.contains(k))
                return k;
            else
                k++;
        }
    }
}