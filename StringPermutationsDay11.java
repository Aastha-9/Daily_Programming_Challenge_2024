import java.util.ArrayList;
import java.util.List;
public class StringPermutationsDay11 {
    public static List<String> findPermutations(String str) {
        List<String> res = new ArrayList<>();
        permuteChars(str.toCharArray(), 0, res);
        return res;
    }

    private static void permuteChars(char[] chArr, int idx, List<String> res) {
        if (idx == chArr.length - 1) {
            res.add(new String(chArr));
            return;
        }
        for (int i = idx; i < chArr.length; i++) {
            swap(chArr, i, idx);
            permuteChars(chArr, idx + 1, res);
            swap(chArr, i, idx);
        }
    }

    private static void swap(char[] chArr, int a, int b) {
        char temp = chArr[a];
        chArr[a] = chArr[b];
        chArr[b] = temp;
    }

    public static void main(String[] args) {
        List<String> permutations = findPermutations("abc");
        System.out.println(permutations);
    }
}
