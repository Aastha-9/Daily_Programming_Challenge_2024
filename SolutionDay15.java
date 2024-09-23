class SolutionDay15 {
    public int findLongestUniqueSubstring(String input) {
        int[] charCount = new int[128];
        int start = 0, end = 0, maxLength = 0;
        while (end < input.length()) {
            char currentChar = input.charAt(end);
            charCount[currentChar]++;
            while (charCount[currentChar] > 1) {
                char startChar = input.charAt(start);
                charCount[startChar]--;
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        SolutionDay15 solution = new SolutionDay15();
        String S = "abcabcbb";
        System.out.println(solution.findLongestUniqueSubstring(S));
    }
}
