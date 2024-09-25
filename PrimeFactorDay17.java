import java.util.*;
public class PrimeFactorDay17 {
    public static List<Integer> getPrimeFactors(int number) {
        List<Integer> primeFactors = new ArrayList<>();
        for (int divisor = 2; divisor <= number / divisor; divisor++) {
            while (number % divisor == 0) {
                primeFactors.add(divisor);
                number /= divisor;
            }
        }
        if (number > 1) primeFactors.add(number);
        return primeFactors;
    }

    public static void main(String[] args) {
        int inputNumber = 18;
        System.out.println(getPrimeFactors(inputNumber));
    }
}
