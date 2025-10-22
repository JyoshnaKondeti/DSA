class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        List<Integer>[] buckets = new List[nums.length+1];
        for(int num: map.keySet()){
            int freq = map.get(num);
            if(buckets[freq] == null){
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        }

        List<Integer> result = new ArrayList<>();
        for(int i=buckets.length-1; i>=0 && result.size() <k; i--){
            if(buckets[i]!=null){
                result.addAll(buckets[i]);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}