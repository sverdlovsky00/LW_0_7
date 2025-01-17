import java.util.Scanner;
public class ex4
	{
	public static void main(String[] args)
		{
		Scanner in = new Scanner(System.in);
		System.out.printf("Input the month: ");
		String mn = in.nextLine();
		System.out.printf("Input the number of days: ");
		int days = in.nextInt();
		System.out.printf("The month %s containts %d days", mn, days);
		in.close();
	}
}