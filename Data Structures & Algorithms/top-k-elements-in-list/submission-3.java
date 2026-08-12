class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        HashMap<Integer,List<Integer>> revMap = new HashMap<>();
        for(Integer i:map.keySet()){
            List<Integer> tempList = revMap.getOrDefault(map.get(i),new ArrayList<Integer>());
            tempList.add(i);
            revMap.put(map.get(i),tempList);
        }
        int[] result = new int[k];
        int count = 0;
        for (int frequency = nums.length; frequency >= 1; frequency--) {
            if(count==k){
                break;
            }
            if (revMap.containsKey(frequency)) {
                List<Integer> tempList = revMap.get(frequency);
                
                for(Integer i:tempList){
                    if(count==k){
                        break;
                    }
                    result[count] = i;
                    count++;
                }
                
            }
        }
        
        return result;
    }
}
