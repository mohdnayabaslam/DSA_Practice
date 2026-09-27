class Solution {
    public String reverseParentheses(String s) {
        int i,j,len=s.length();
        Stack<Character> st = new Stack<>();
        for(i=0;i<len;i++) 
        {
            char ch=s.charAt(i);
            if(ch==')') 
            {
                StringBuilder sb = new StringBuilder();
                while(!st.isEmpty() && st.peek()!='(') 
                {
                    sb.append(st.pop());
                }
                if(!st.isEmpty()) 
                {
                    st.pop();
                }
                for(j=0; j<sb.length();j++) 
                {
                    st.push(sb.charAt(j));
                }
            } 
            else 
            {
                st.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) 
        {
            result.append(st.pop());
        }
        return result.reverse().toString();
    }
}