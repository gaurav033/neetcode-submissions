class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        List<Integer>[] buckets = new List[nums.length+1];

        for(int i:map.keySet()){
            int freq = map.get(i);
            if(buckets[freq]==null){
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(i);
        }

        int[] result = new int[k];
        int count = 0;

        for(int i=buckets.length-1;i>=0 && count<k;i--){
            if(buckets[i]!=null){
                for(int num:buckets[i]){
                    result[count] = num;
                    count++;

                    if(count==k){
                        break;
                    }
                }
            }
        }
        return result;
    }
}
