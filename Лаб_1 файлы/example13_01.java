import java.util.Scanner;
public class ex6
	{
	public static void main(String[] args)
		{
		Scanner in = new Scanner(System.in);
		System.out.print("Input name: ");
		String name = in.nextLine();
		System.out.printf("Input year of brith: ");
		int year = in.nextInt();
		System.out.printf("You are %s, %d y.o.", name, 2024-year);
		in.close();
	}
}