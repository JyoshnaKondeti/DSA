public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    Map<Character, Integer> lastIndex = new HashMap<>();
    int maxLen = 0, start = 0;

    for (int i = 0; i < n; i++) {
        char c = s.charAt(i);
        if (lastIndex.containsKey(c) && lastIndex.get(c) >= start) {
            start = lastIndex.get(c) + 1;
        }
        lastIndex.put(c, i);
        maxLen = Math.max(maxLen, i - start + 1);
    }
    return maxLen;
}
