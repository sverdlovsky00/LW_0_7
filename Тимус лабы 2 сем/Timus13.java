import java.util.Scanner;

import java.util.Scanner;

public class Timus13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] dp = new long[N + 1];
        dp[0] = 1; // Одна пустая лестница

        for (int i = 1; i <= N; i++) {
            dp[i] = 1; // Лестница с одной ступенью
            for (int j = 1; j <= i / 2; j++) {
                dp[i] += dp[i - j];
            }
        }

        System.out.println(dp[N]);
    }
}