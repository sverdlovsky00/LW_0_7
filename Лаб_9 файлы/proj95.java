package proj901;

public class proj95 {
	private static int step = 0;

	public static void main(String[] args) {
		System.out.println("Результат: " + fact(5));
	}

	public static int fact(int n) {
		space();
		System.out.println("Вход в fact(" + n + ")");
		step++;

		int result;
		if (n == 0) {
			result = 0;
		} else if (n == 1) {
			result = 1;
		} else {
			result = fact(n - 2) + fact(n - 1);
		}

		step--;
		space();
		System.out.println("Выход из fact(" + n + ") = " + result);

		return result;
	}

	public static void space() {
		for (int i = 0; i < step; i++) {
			System.out.print("  ");
		}
	}
}