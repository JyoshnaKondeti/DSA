class Solution {
    public int mostFrequent(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);
        int maxFreq = 0, ans = Integer.MAX_VALUE;
        for (int n : map.keySet()) {
            int f = map.get(n);
            if (f > maxFreq || (f == maxFreq && n < ans)) {
                maxFreq = f;
                ans = n;
            }
        }
        return ans;
    }
}
