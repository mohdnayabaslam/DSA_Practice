class Solution {
    public String removeDuplicates(String s, int k) {
        int i,len=s.length(),count=1;
        Stack<Character> stChar = new Stack<>();
        Stack<Integer> stCount = new Stack<>();
        for(i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(!stChar.isEmpty() && stChar.peek()==ch)
            {
                stChar.push(ch);
                stCount.push(stCount.peek()+1);
            }
            else
            {
                stChar.push(ch);
                stCount.push(1);
            }
            if(stCount.peek()==k)
            {
                int temp=k;
                while(temp>=1)
                {
                    stChar.pop();
                    stCount.pop();
                    temp--;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stChar.isEmpty())
        {
            sb.append(stChar.pop());
        }
        return sb.reverse().toString();
    }
}