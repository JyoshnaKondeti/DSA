import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>();
        for (String b : banned) ban.add(b.toLowerCase());
        Map<String, Integer> count = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= paragraph.length(); i++) {
            char c = i < paragraph.length() ? paragraph.charAt(i) : ' ';
            if (Character.isLetter(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (sb.length() > 0) {
                String word = sb.toString();
                if (!ban.contains(word)) {
                    count.put(word, count.getOrDefault(word, 0) + 1);
                }
                sb.setLength(0);
            }
        }
        String res = "";
        int max = 0;
        for (Map.Entry<String, Integer> e : count.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                res = e.getKey();
            }
        }
        return res;
    }
}
