import java.util.*;
public class FirstElementRepeatKTimesDay22 {
    public static int getFirstElement(int[] numbers, int targetCount) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int value : numbers) {
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }
        for (int value : numbers) {
            if (frequencyMap.get(value) == targetCount) {
                return value;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 4, 5, 2, 6, 1, 4};
        int targetCount = 2;
        System.out.println(getFirstElement(numbers, targetCount));
    }
}
