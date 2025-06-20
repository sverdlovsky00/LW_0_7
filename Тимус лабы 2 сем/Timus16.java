import java.util.Scanner;

public class Timus16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // Массив для хранения минимального количества топлива
        int[] dp = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;

        // Заполнение массива dp
        for (int i = 0; i <= N; i++) {
            if (dp[i] != Integer.MAX_VALUE) {
                for (int j = 1; j <= M && i + j <= N; j++) {
                    dp[i + j] = Math.min(dp[i + j], dp[i] + j);
                }
            }
        }

        // Вывод результата
        System.out.println(dp[N]);
    }
}