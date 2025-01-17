import java.util.Scanner;
public class ex8
	{
	public static void main(String[] args)
		{
		Scanner in = new Scanner(System.in);
		System.out.printf("How do you old? ");
		int year = in.nextInt();
		System.out.printf("You are %d year of brith", 2024-year);
		in.close();
	}
}