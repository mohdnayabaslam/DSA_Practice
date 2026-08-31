class Solution {
    public int findTheWinner(int n, int k) {
        int i,cur=0;
        ArrayList<Integer> al = new ArrayList<>();
        for(i=1;i<=n;i++)
        {
            al.add(i);
        }
        while(al.size()>1)
        {
            cur=(cur+k-1)%(al.size());
            al.remove(cur);
        }
        return al.get(0);
    }
}