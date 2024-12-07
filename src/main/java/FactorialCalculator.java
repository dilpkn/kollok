import java.util.ArrayList;
import java.util.List;

public class FactorialCalculator {
    public static List<Long> calculateFactorials(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Параметр n должен быть натуральным числом (n > 0).");
        }

        List<Long> factorials = new ArrayList<>();
        factorials.add(1L); // 1! = 1

        for (int i = 1; i < n; i++) {
            long previousFactorial = factorials.get(i - 1);
            long currentFactorial = previousFactorial * (i + 1); // Вычисление текущего факториала
            factorials.add(currentFactorial);
        }

        return factorials;
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorials(16));
    }
}
