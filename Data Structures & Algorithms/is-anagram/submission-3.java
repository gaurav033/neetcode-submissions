class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        // Map<Character,Integer> strt = new HashMap<Character,Integer>();
    //     for(char c:s.toCharArray()){
    //         if(strs.containsKey(c)){
    //             strs.put(c,strs.get(c)+1);
    //         }else{
    //             strs.put(c,1);
    //         }
    //     }

    //     for(char c:t.toCharArray()){
    //         if(strt.containsKey(c)){
    //             strt.put(c,strt.get(c)+1);
    //         }else{
    //             strt.put(c,1);
    //         }
    //     }

    //     for(char c:strs.keySet()){
    //         if(!strs.get(c).equals(strt.get(c))){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
        }

        for(char c:map.keySet()){
            if(map.get(c)!=0){
                System.gc();
                return false;
            }
        }
        System.gc();
        return true;
    }
}
