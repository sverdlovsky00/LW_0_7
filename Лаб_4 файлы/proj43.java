package proj401;
import java.util.Scanner;
public class proj43 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] mass = new int[20][20];
		for (int i=0; i<20; i++){
			for (int j=0; j<20; j++){
				mass[i][j]=2;
				}
		}
		for (int i=0; i<20; i++){
			for (int j=0; j<20; j++){
				System.out.print(" "+mass[i][j]);
				}
			System.out.print("\n");
		}
	in.close();
	}
}