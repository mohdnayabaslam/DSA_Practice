class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> n = new ArrayList<>();
        int i,len=nums.length;
        Arrays.sort(nums);
        for(i=0;i<len;i++)
        {
            if(nums[i]==target)
            {
                n.add(i);
            }
        }
        return n;
    }
}