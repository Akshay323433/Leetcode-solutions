class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String>map=new HashMap<>();
        String []word=s.split(" ");
        if(pattern.length()!=word.length)
        {
            return false;
        }
        else
        {
        for(int i=0;i<word.length;i++)
        {
             char c=pattern.charAt(i);
             if(map.containsKey(c))
             {
                if(!word[i].equals(map.get(c)))
                {
                    return false;
                }
             }
             else
             {
                if(map.containsValue(word[i]))
                {
                    return false;
                }
                else
                {
                      map.put(c,word[i]);
                }
             }
        }
    }
    return true;
}
}