class Solution {
    public String removeOccurrences(String s, String part) {
        int i,len=s.length(),l=part.length();
        StringBuilder sb = new StringBuilder();
        for(i=0;i<len;i++)
        {
            sb.append(s.charAt(i));
            if(sb.length()>=l)
            {
                if((sb.substring(sb.length()-l,sb.length())).equalsIgnoreCase(part))
                    sb.delete(sb.length()-l,sb.length());
            }   
        }
        return sb.toString();
    }
}