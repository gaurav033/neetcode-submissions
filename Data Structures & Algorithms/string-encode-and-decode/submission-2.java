class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<strs.size();i++){
            result.append(strs.get(i).length());
            result.append("#");
            result.append(strs.get(i));
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int pointer = 0;
        while(pointer<str.length()){
            int hashPosition = str.indexOf("#",pointer);
            
            int start = hashPosition + 1;
            
            int length = Integer.parseInt(str.substring(pointer,hashPosition));
            
            int end = start+length;
            result.add(str.substring(start,end));
            
            pointer=end;
        }
        return result;
    }
}
