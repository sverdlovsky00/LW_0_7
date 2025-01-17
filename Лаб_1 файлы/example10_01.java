import java.util.Scanner;
public class ex3
	{
	public static void main(String[] args)
		{
		Scanner in = new Scanner(System.in);
		System.out.printf("Input the date (DD/MM/YYYY): ");
		String date = in.nextLine();
		System.out.printf("Input the day of the week: ");
		String day = in.nextLine();
		System.out.printf("Date is: %s, %s", date, day);
		in.close();
	}
}