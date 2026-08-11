class Solution {
public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> result = new ArrayList<>();
       HashMap<String,List<String>> map = new HashMap<>();
       
       for(int i=0;i<strs.length;i++){
           String temp = strs[i];
           char[] tempArr = temp.toCharArray();
           Arrays.sort(tempArr);
           String key = new String(tempArr);
           
           List<String> keyList = map.getOrDefault(key,new ArrayList<String>());
            keyList.add(temp);
            map.put(key,keyList);
       }
       
       for(String s:map.keySet()){
           result.add(map.get(s));
       }
       return result;
}
}
