class Solution {
    public int scoreOfParentheses(String s) {
        int i,len = s.length();
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (i=0;i<len;i++) 
        {
            char ch = s.charAt(i);
            if (ch == '(') 
            {
                st.push(0);
            } 
            else 
            {
                int curr = st.pop();
                int prev = st.pop();
                if (curr == 0) {
                    curr = 1;
                } 
                else 
                {
                    curr = 2 * curr;
                }
                st.push(prev + curr);
            }
        }
        return st.pop();
    }
}
