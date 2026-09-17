class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())
            return false;
        int i,len=word1.length();
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        for(i=0;i<len;i++)
        {
            set1.add(word1.charAt(i));
            set2.add(word2.charAt(i));
        }
        if(!set1.equals(set2))
            return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(i=0;i<len;i++)
        {
            char ch1=word1.charAt(i);
            char ch2=word2.charAt(i);
            map1.put(ch1,(map1.getOrDefault(ch1,0)+1));
            map2.put(ch2,(map2.getOrDefault(ch2,0)+1));
        }
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        for(int m : map1.values())
        {
            al1.add(m);
        }
        for(int n : map2.values())
        {
            al2.add(n);
        }
        Collections.sort(al1);
        Collections.sort(al2);
        if(al1.equals(al2))
            return true;
        return false;
    }
}