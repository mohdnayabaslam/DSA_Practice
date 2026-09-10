class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int i,len=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        for(i=0;i<len;i++)
        {

            sum=sum+nums[i];
            if(sum%k==0 && i+1>=2)
                return true;
            if(map.get(sum%k)!=null)
            {
                if((i-map.get(sum%k))>=2)
                    return true;
            }
            else
            {
                map.put(sum%k,i);
            }
        }
        return false;
    }
}