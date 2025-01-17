package proj401;
import java.util.Scanner;
public class proj45 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = 20;
		int[][] mass = new int[20][20];
		for (int i=0; i<20; i++){
			for (int j=0; j<a; j++){
				mass[i][j]=2;
				}
			a--;
		}
		for (int i=0; i<20; i++){
			for (int j=0; j<20; j++){
				if(mass[i][j]==2)	{System.out.print(" "+mass[i][j]);}
				}
			System.out.print("\n");
		}
	in.close();
	}
}