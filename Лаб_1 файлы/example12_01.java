import java.util.Scanner;
public class ex5
	{
	public static void main(String[] args)
		{
		Scanner in = new Scanner(System.in);
		System.out.printf("Input year of brith: ");
		int year = in.nextInt();
		System.out.printf("You are %d y.o.", 2024-year);
		in.close();
	}
}