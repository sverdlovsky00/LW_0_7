package proj801;
import java.util.Scanner;
public class timus81 {

	public static long findBig(long num1, long num2) {
		while (num2 != 0) {
			long temp = num2;
			num2 = num1 % num2;
			num1 = temp;}
	        return num1;}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите p и q:");
		long p = scanner.nextLong();
		long q = scanner.nextLong();

		System.out.println("Введите координаты текущей планеты (x и y):");
		long xStart = scanner.nextLong();
		long yStart = scanner.nextLong();

		System.out.println("Введите координаты целевой планеты (x1 и y1):");
		long xEnd = scanner.nextLong();
		long yEnd = scanner.nextLong();

		long dx = Math.abs(xEnd - xStart);
		long dy = Math.abs(yEnd - yStart);

		long greatestCommonDivisor = findBig(p, q);

		boolean canReachX = dx % greatestCommonDivisor == 0;
		boolean canReachY = dy % greatestCommonDivisor == 0;

		if (canReachX && canReachY) {System.out.println("YES");}
			else {System.out.println("NO");}

	        scanner.close();
	    }
}
