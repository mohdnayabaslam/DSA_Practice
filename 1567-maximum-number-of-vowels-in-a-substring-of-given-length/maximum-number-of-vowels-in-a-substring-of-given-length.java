class Solution {
    public int maxVowels(String s, int k) {
        String vowels="aeiou";
        int i,len=s.length(),count=0,maxcount;
        for(i=0;i<k;i++)
        {
            if(vowels.indexOf(s.charAt(i))!=-1)
                count++;
        }
        maxcount=count;
        for(i=k;i<len;i++)
        {
            if(vowels.indexOf(s.charAt(i))!=-1)
            {
                count++;
            }
            if(vowels.indexOf(s.charAt(i-k))!=-1)
            {
                count--;
            }
            maxcount=Math.max(count,maxcount);
        }
        return maxcount;
    }
}