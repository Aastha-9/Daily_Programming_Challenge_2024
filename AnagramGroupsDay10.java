import java.util.*;
public class AnagramGroupsDay10 {
    public List<List<String>> group(String[] words) {
        Map<String, List<String>> result = new HashMap<>();
        for (String word : words) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sortedWord = new String(arr);
            if (!result.containsKey(sortedWord)) {
                result.put(sortedWord, new ArrayList<>());
            }
            result.get(sortedWord).add(word);
        }
        return new ArrayList<>(result.values());
    }

    public static void main(String[] args) {
        AnagramGroupsDay10 ag = new AnagramGroupsDay10();
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(ag.group(words));
    }
}
