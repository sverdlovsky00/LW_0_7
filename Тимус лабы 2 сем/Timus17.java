import java.util.*;

public class Timus17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Y = scanner.nextInt();

        List<Integer> result = new ArrayList<>();

        // Перебор всех значений X от 0 до M - 1
        for (int X = 0; X < M; X++) {
            // Проверка условия X^N mod M = Y
            if (modPow(X, N, M) == Y) {
                result.add(X);
            }
        }

        // Вывод результата
        if (result.isEmpty()) {
            System.out.println(-1);
        } else {
            for (int X : result) {
                System.out.print(X + " ");
            }
        }
    }

    // Функция для вычисления X^N mod M
    private static int modPow(int base, int exponent, int modulus) {
        long result = 1;
        long b = base % modulus;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * b) % modulus;
            }
            exponent >>= 1;
            b = (b * b) % modulus;
        }
        return (int) result;
    }
}