class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> bag = new ArrayList<>();
        int i=0;
        calculate(i,bag,nums,ans);
        return ans;
    }
    static void calculate(int i,List<Integer> bag,int nums[],List<List<Integer>> ans)
    {
        int len=nums.length;
        if(nums.length==i)
        {
            ans.add(new ArrayList<>(bag));
            return;
        }
        bag.add(nums[i]);
        calculate(i+1,bag,nums,ans);
        bag.remove(bag.size()-1);
        calculate(i+1,bag,nums,ans);
    }
}