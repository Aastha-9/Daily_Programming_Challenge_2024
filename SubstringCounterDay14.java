import java.util.HashMap;
public class SubstringCounterDay14 {
    public static int countSubstrings(String s, int k) {
        return countAtMostK(s, k) - countAtMostK(s, k - 1);
    }

    private static int countAtMostK(String s, int k) {
        int count = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            while (map.size() > k) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                if (map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "pqpqs";
        int k = 2;
        System.out.println(countSubstrings(s, k));
    }
}
