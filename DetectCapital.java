class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toLowerCase())) return true;
        if(word.equals(word.toUpperCase())) return true;
        String firstCapital = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        if(word.equals(firstCapital)) return true;
        return false;
    }
} 