import java.util.Scanner;
public class ex9
	{
	public static void main(String[] args)
		{
		Scanner in = new Scanner(System.in);
		System.out.print("Input your num: ");
		int n1 = in.nextInt();
		int n2 = n1-1;
		int n3 = n1+1;
		int n4 = (n2+n1+n3)*(n2+n1+n3);
		System.out.printf("The furst nun is %d, second is %d, thrid is %d, fourth is %d", n2, n1, n3, n4);
		in.close();
	}
}