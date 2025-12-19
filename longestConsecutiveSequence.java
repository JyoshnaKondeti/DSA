class Solution {
    public int longestConsecutive(int[] nums) {
        int longest =0;
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        for(int num: set){
            if(!set.contains(num-1)){
                int count=1;
                int currentNum = num;
                while(set.contains(currentNum+1)){
                    count++;
                    currentNum++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}