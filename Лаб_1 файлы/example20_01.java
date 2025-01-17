import java.util.Scanner;
public class ex13{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a: ");
		Double a = in.nextDouble();
		System.out.print("Input b: ");
		Double b = in.nextDouble();
		Double d = Math.pow(a, b);
		System.out.println("A=" + a);
		System.out.println("B=" + b);
		System.out.println("D = A^b=" + d);
		in.close();
	}
}
