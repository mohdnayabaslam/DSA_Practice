class Solution {
    public String minRemoveToMakeValid(String s) {
        int i,len=s.length();
        char ch;
        Stack<Integer> st = new Stack<>();
        boolean arr[] = new boolean[len];
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch=='(')
                st.push(i);
            if(ch==')')
            {
                if(!st.isEmpty())
                    st.pop();
                else
                    arr[i]=true;
            }
        }
        while(!st.isEmpty())
        {
            arr[st.peek()]=true;
            st.pop();
        }
        StringBuilder sb = new StringBuilder();
        for(i=0;i<len;i++)
        {
            if(arr[i]==false)
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}