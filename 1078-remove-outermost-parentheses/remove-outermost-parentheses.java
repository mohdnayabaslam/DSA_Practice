class Solution {
    public String removeOuterParentheses(String s) {
        int i,len=s.length(),balance=0;
        char ch;
        StringBuffer str = new StringBuffer();
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch=='(' && balance>0)
            {
                balance++;
                str.append(ch);
            }
            else if(ch==')' && balance>1)
            {
                balance--;
                str.append(ch);
            }
            else if(ch=='(')
            {
                balance++;
            }
            else
            {
                balance--;
            }
        }
        return str.toString();
    }
}