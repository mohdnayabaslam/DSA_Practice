class Solution {
    public int numberOfSubstrings(String s) 
    {
        int[] last = {-1, -1, -1};
        int i,len=s.length(),ans = 0;
        for(i= 0;i<len;i++) 
        {
            last[s.charAt(i) - 'a'] = i;
            ans += Math.min(last[0], Math.min(last[1], last[2])) + 1;
        }
        return ans;
    }
}   