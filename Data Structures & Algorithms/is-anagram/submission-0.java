class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> strs = new HashMap<Character,Integer>();
        Map<Character,Integer> strt = new HashMap<Character,Integer>();
        for(char c:s.toCharArray()){
            if(strs.containsKey(c)){
                strs.put(c,strs.get(c)+1);
            }else{
                strs.put(c,1);
            }
        }

        for(char c:t.toCharArray()){
            if(strt.containsKey(c)){
                strt.put(c,strt.get(c)+1);
            }else{
                strt.put(c,1);
            }
        }

        for(char c:strs.keySet()){
            if(!strs.get(c).equals(strt.get(c))){
                return false;
            }
        }
        return true;
    }
}
