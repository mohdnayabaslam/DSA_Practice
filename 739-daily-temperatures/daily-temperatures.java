class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int i,len=temperatures.length;
        Stack<Integer> st = new Stack<>();
        int arr[] = new int[len];
        for(i=len-1;i>=0;i--)
        {
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i])
            {
                st.pop();
            }
            if(st.isEmpty())
                arr[i]=0;
            else
                arr[i]=st.peek()-i;
            st.push(i);
        }
        return arr;
    }
}