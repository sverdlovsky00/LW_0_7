package proj801;
import java.util.Scanner;
public class timus82 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество полосок: ");
		int N = scanner.nextInt();
		long[][] dp = new long[N + 1][3];

		dp[1][0] = 1;
		dp[1][1] = 0;
		dp[1][2] = 1;

		for (int i = 2; i <= N; i++) {
			dp[i][0] = dp[i - 1][2];
			dp[i][2] = dp[i - 1][0];
			dp[i][1] = dp[i - 2][0] * dp[1][2] + dp[i - 2][2] * dp[1][0];}

		long numWays = dp[N][0] + dp[N][1] + dp[N][2];
		System.out.println("Количество способов украсить витрину: ");
		System.out.println(numWays);
		scanner.close();}
}
