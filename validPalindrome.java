class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        int start =0;
        int end = s.length()-1;
        while(start<=end){
            int first = s.charAt(start);
            int last = s.charAt(end);
            if(!Character.isLetterOrDigit(first)){
                start++;
                continue;
            } 
            if(!Character.isLetterOrDigit(last)){
                end--;
                continue;
            } 
            if(Character.toLowerCase(first) != Character.toLowerCase(last)) return false;
            start++;
            end--;
        }
        return true;
    }
}