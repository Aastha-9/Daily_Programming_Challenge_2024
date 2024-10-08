public class ReverseWordsDay8 {
    public static String reverseWords(String s) {
        s = s.trim();
        String[] w = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i = w.length - 1; i >= 0; i--) {
            res.append(w[i]);
            if (i > 0) res.append(" ");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String input = "  the sky is blue  ";
        System.out.println(reverseWords(input)); 
    }
}
