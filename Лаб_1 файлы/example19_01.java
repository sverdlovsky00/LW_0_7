import java.util.Scanner;
public class ex12{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a: ");
		Double a = in.nextDouble();
		System.out.print("Input b: ");
		Double b = in.nextDouble();
		Double hyp = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		System.out.println("A=" + a);
		System.out.println("B=" + b);
		System.out.println("Hypotenuse C=" + hyp);
		in.close();
	}
}
