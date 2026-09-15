class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int i,len=matches.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(i=0;i<len;i++)
        {
            int winner=matches[i][0];
            int loser=matches[i][1];
            map.putIfAbsent(winner,0);
            map.put(loser,map.getOrDefault(loser,0)+1);
        }
        List<List<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> zeroloss = new ArrayList<>();
        ArrayList<Integer> oneloss = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
        {
            int player=entry.getKey();
            int loss=entry.getValue();
            if (loss == 0)
                zeroloss.add(player);
            if (loss == 1)
                oneloss.add(player);
        }
        Collections.sort(zeroloss);
        Collections.sort(oneloss);
        arr.add(zeroloss);
        arr.add(oneloss);
        return arr;
    }
}