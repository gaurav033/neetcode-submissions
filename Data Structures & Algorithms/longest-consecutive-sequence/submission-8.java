class Solution {
    private int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        List<Integer> startingPoints = new ArrayList<>();
        for(int num:nums){
            if(!set.contains(num-1)){
                startingPoints.add(num);
            }
        }
        List<Integer> lenList = new ArrayList<>();
        int len = 0;
        for(int num:startingPoints){
            int temp = num;
            while(set.contains(temp)){
                len++;
                temp++;

            }
            lenList.add(len);
            len=0;

        }

        int greatest = Integer.MIN_VALUE;
        for(int num:lenList){
            if(num>greatest){
                greatest=num;
            }
        }
        return greatest;
    }
}
