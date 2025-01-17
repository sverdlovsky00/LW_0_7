import java.util.Scanner;
public class ex10
	{
	public static void main(String[] args)
		{
		Scanner in = new Scanner(System.in);
		System.out.print("Input first num: ");
		int n1 = in.nextInt();
		System.out.printf("Input second num: ");
		int n2 = in.nextInt();
		System.out.printf("The sum is %d, the difference is %d", n1+n2, n1-n2);
		in.close();
	}
}