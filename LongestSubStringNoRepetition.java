class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<>();
        int left=0, right=0, length=0;
        while(right<s.length()){
            char ch = s.charAt(right);
            if(!seen.contains(ch)) {
                seen.add(ch);
                length = Math.max(length, (right-left)+1);
                right++;
            }
            else{
                seen.remove(s.charAt(left));
                left++;
            }
        }
        return length;
    }
}