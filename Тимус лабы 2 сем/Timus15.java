import java.util.*;

import java.util.Scanner;

public class Timus15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Массив для хранения количества способов
        long[][][] dp = new long[N + 1][A + 1][B + 1];
        dp[0][0][0] = 1; // Для 0 коробок и 0 шаров есть ровно один способ

        // Заполнение массива dp
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= A; j++) {
                for (int k = 0; k <= B; k++) {
                    // Оставить коробку пустой
                    dp[i][j][k] += dp[i - 1][j][k];

                    // Положить красные шары в коробку
                    if (j > 0) {
                        dp[i][j][k] += dp[i - 1][j - 1][k];
                    }

                    // Положить синие шары в коробку
                    if (k > 0) {
                        dp[i][j][k] += dp[i - 1][j][k - 1];
                    }

                    // Положить красные и синие шары в коробку
                    if (j > 0 && k > 0) {
                        dp[i][j][k] += dp[i - 1][j - 1][k - 1];
                    }
                }
            }
        }

        // Вывод результата
        System.out.println(dp[N][A][B]);
    }
}