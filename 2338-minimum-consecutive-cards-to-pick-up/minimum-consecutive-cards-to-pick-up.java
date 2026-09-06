class Solution {
    public int minimumCardPickup(int[] cards) {
        int i,len=cards.length,card;
        int minlen=len+1;
        HashMap<Integer,Integer> lastseen = new HashMap<>();
        for(i=0;i<len;i++)
        {
            card=cards[i];
            if(lastseen.containsKey(card))
            {
                int l=i-lastseen.get(card)+1;
                minlen=Math.min(minlen,l);
            }
            lastseen.put(card,i);
        }
        if(minlen<len+1)
            return minlen;
        return -1;
    }
}