import java.util.*;
public class DivisorDay18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) count++;
        }
        System.out.println(count);
    }
}
