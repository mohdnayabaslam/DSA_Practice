class Solution {
    public int mostFrequentEven(int[] nums) {
        int i,len=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(i=0;i<len;i++)
        {
            if(nums[i]%2==0)
            {
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        int maxfreq=0,ans=-1;
        for(int j:map.keySet())
        {
            if(map.get(j)>maxfreq || (map.get(j)==maxfreq && j<ans))
            {
                maxfreq=map.get(j);
                ans=j;
            }
        }
        return ans;
    }
}