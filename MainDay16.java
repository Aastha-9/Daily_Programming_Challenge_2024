import java.util.Scanner;
public class MainDay16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int gcd = findGCD(N, M);
        int lcm = (N * M) / gcd;
        System.out.println(lcm);
    }

    public static int findGCD(int N, int M) {
        while (M != 0) {
            int temp = M;
            M = N % M;
            N = temp;
        }
        return N;
    }
}
