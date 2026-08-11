class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            int key = Integer.MIN_VALUE;
            int largest = Integer.MIN_VALUE;
            
            for(Integer i1:map.keySet()){
                if(map.get(i1)>largest && !set.contains(i1)){
                    largest = map.get(i1);
                    key = i1;
                }
            }
            result[i] = key;
            set.add(key);
        }
        return result;
    }
}
