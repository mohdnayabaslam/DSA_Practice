class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int i,len=arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(i=0;i<len;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int value : map.values())
        {
            if(!set.contains(value))
                set.add(value);
            else
                return false;
        }
        return true;
    }
}