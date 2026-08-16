class Solution {
    private int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int leng = 0;
        for(int num:set){
            if(!set.contains(num-1)){
                int temp = num;
                int len = 0;
                while(set.contains(temp)){
                    len++;
                    temp++;

                }
                if(len>leng){
                    leng = len;
                }
            }
        }
        return leng;
    }
}
