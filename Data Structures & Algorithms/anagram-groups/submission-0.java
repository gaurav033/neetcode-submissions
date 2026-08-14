class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(String s:strs){
            char[] sArr = s.toCharArray();
            Arrays.sort(sArr);
            String key = new String(sArr);
            ArrayList<String> list = map.getOrDefault(key,new ArrayList<String>());
            list.add(s);
            map.put(key,list);
        }
        List<List<String>> result = new ArrayList<>();
        for(List<String> list:map.values()){
            result.add(list);
        }
        return result;
    }
}
