import java.util.*;
public class RomanToInteger{
    public static int convert(String s){
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int total = 0;
        for (int i=0; i<s.length() ; i++){
            int current = roman.get(s.charAt(i));
            int newValue = (i + 1 < s.length()) ? roman.get(s.charAt(i + 1)) : 0;
            if(current<newValue) total -= current;
            else {
                total += current;
            }
        }
        return total;
    }
    public static void main (String[] args){
        String roman1 = "MCMXCIV";   
        String roman2 = "XLII";      
        String roman3 = "IV";
        System.out.println(roman1 + "=" + convert(roman1));
        System.out.println(roman2 + "=" + convert(roman2));
        System.out.println(roman3 + "=" + convert(roman3));
    }
}