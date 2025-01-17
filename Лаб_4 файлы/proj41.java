package proj401;
import java.util.Scanner;
public class proj41 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int fg = 11;
		int j;
		int i;
		int z = 0;
		for (i = 1; i<=fg; i++){
			z=0;
			for (j=-12; j<fg; j++){
				System.out.print("+");
				z = z+1;
				}
			System.out.print("   " + z + ": " + "\n");
		}
	in.close();
	}
}