public class FindDuplicateDay3 {
    public static int findDuplicate(int[] arr) {
        int x = arr[0];
        int y = arr[0];
        do {
            x = arr[x];
            y = arr[arr[y]];
        } while (x != y);
        y = arr[0];
        while (x != y) {
            x = arr[x];
            y = arr[y];
        }
        return x;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 4, 2};
        System.out.println("The Duplicate Number is :" + findDuplicate(arr));
    }
}
