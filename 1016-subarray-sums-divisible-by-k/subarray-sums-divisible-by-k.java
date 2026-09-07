class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int i,len=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int runsum=0,count=0;
        for(i=0;i<len;i++)
        {
            runsum=runsum+nums[i];
            int r=runsum%k;
            if(r<0)
                r=r+k;
            if(map.containsKey(r))
            {
                count=count+map.get(r);
            }
            map.put(r, map.getOrDefault(r,0)+1);
        }
        return count;
    }
}