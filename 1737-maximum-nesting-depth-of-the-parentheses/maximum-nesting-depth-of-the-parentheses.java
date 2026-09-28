class Solution {
    public int maxDepth(String s) {
        int i,len=s.length(),max=0,current=0;
        char ch;
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch=='(')
                current++;
            if(ch==')')
                current--;
            max=Math.max(max,current);
        }
        return max;
    }
}