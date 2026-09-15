class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String> map = new HashMap<>();
        int i,len=paths.size();
        for(i=0;i<len;i++)
        {
            String src=paths.get(i).get(0);
            String dest=paths.get(i).get(1);
            map.put(src,dest);
        }
        for(String dest : map.values())
        {
            if(!map.containsKey(dest))
                return dest;
        }
        return "";
    }
}