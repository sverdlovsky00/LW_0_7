package proj401;
import java.util.Scanner;
public class proj42 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = 20;
		for (int i = 1; i<=20; i++){
			for (int j=1; j<a; j++){
				System.out.print("+ ");		;
				}
			System.out.print("   " + " " + "\n");
			a--;
		}
	in.close();
	}
}