class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i,len1=s.length(),len2=t.length();
        char ch;
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(i=0;i<len1;i++)
        {
            ch=s.charAt(i);
            if(ch!='#')
                st1.push(ch);
            else
            {
                if(!st1.isEmpty())
                st1.pop();
            }
        }
        for(i=0;i<len2;i++)
        {
            ch=t.charAt(i);
            if(ch!='#')
                st2.push(ch);
            else
            {
                if(!st2.isEmpty())
                st2.pop();
            }
        }
        return st1.equals(st2);
    }
}