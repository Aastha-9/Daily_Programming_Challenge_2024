public class RainWaterTrappingDay7 {
    public static int calculateTrappedWater(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        int start = 0, end = heights.length - 1;
        int maxLeft = 0, maxRight = 0;
        int totalTrappedWater = 0;
        while (start < end) {
            if (heights[start] < heights[end]) {
                if (heights[start] >= maxLeft) {
                    maxLeft = heights[start];
                } else {
                    totalTrappedWater += maxLeft - heights[start];
                }
                start++;
            } else {
                if (heights[end] >= maxRight) {
                    maxRight = heights[end];
                } else {
                    totalTrappedWater += maxRight - heights[end];
                }
                end--;
            }
        }
        return totalTrappedWater;
    }
    public static void main(String[] args) {
        int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Total water trapped: " + calculateTrappedWater(heights));
    }
}
