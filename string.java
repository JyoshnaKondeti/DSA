import java.util.*;

public class string{
    public static void main(String[] args){
        System.out.println(isPalindrome("abcba"));
        System.out.println(isPalindrome("abcb"));
    }
    public static Boolean isPalindrome(String str){
        int start = 0;
        int end = str.length() -1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)) return false;
                start++;
                end--;
        }

        return true;
    }
}