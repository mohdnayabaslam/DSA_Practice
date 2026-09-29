class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int i,len=asteroids.length;
        Stack<Integer> st = new Stack<>();
        for(i=0;i<len;i++)
        {
            if(asteroids[i]>0)
                st.push(asteroids[i]);
            else
            {
                while(!st.isEmpty() && st.peek()>0)
                {
                    if(st.peek()<Math.abs(asteroids[i]))
                        st.pop();
                    else if(st.peek()==Math.abs(asteroids[i]))
                    {
                        st.pop();
                        asteroids[i]=0;
                        break;
                    }
                    else
                    {
                        asteroids[i]=0;
                        break;
                    }
                }
                if(asteroids[i]!=0)
                    st.push(asteroids[i]);
            }
        }
        int arr[] = new int[st.size()];
        for(i=arr.length-1;i>=0;i--)
        {
            arr[i]=st.pop();
        }
        return arr;
    }
}