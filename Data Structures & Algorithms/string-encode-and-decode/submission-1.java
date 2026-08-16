class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s:strs){
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int pointer = 0;

        while(pointer<str.length()){
            int hashIndex = str.indexOf("#",pointer);
            int length = Integer.parseInt(str.substring(pointer,hashIndex));
            int start = hashIndex+1;
            int end = start+length;
            result.add(str.substring(start,end));
            pointer = end;
        }

        return result;
    }
}
