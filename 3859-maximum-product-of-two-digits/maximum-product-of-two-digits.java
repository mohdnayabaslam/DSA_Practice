class Solution {
    public int maxProduct(int n) {
        int r;
        ArrayList<Integer> al = new ArrayList<>();
        while(n>0)
        {
            r=n%10;
            n=n/10;
            al.add(r);
        }
        Collections.sort(al);
        return ((al.get(al.size()-1)*(al.get(al.size()-2))));
    }
}