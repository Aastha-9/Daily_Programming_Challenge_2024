import java.util.*;
public class ZeroSumSubarraysDay6 {
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                result.add(new int[]{0, i});
            }
            if (map.containsKey(sum)) {
                List<Integer> indices = map.get(sum);
                for (int index : indices) {
                    result.add(new int[]{index + 1, i});
                }
            }
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
        return result;
    }
    public static void printSubarrays(List<int[]> subarrays) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < subarrays.size(); i++) {
            int[] subarray = subarrays.get(i);
            sb.append("(").append(subarray[0]).append(", ").append(subarray[1]).append(")");
            if (i != subarrays.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, -1, 2};
        List<int[]> subarrays = findZeroSumSubarrays(arr);
        printSubarrays(subarrays);
    }
}
