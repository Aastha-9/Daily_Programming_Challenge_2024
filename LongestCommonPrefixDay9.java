public class LongestCommonPrefixDay9 {
    public static String findPrefix(String[] arr) {
        if (arr == null || arr.length == 0) return "";
        String pre = arr[0];
        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
                if (pre.isEmpty()) return "";
            }
        }
        return pre;
    }

    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        System.out.println(findPrefix(words));
    }
}
