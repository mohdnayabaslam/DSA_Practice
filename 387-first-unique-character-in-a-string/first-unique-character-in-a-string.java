class Solution {
    public int firstUniqChar(String s) {
        int i,len=s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(i=0;i<len;i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(i=0;i<len;i++)
        {
            if(map.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
}