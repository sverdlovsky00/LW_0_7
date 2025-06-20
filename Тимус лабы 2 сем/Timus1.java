import java.util.Scanner;

public class Timus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // Массив для хранения количества "красивых" графов
        long[] dp = new long[N + 1];
        dp[1] = 1; // Для одной вершины есть ровно один "красивый" граф

        // Заполнение массива dp
        for (int i = 2; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] += dp[j];
            }
        }

        // Вывод результата
        System.out.println(dp[N]);
    }
}