package proj401;
import java.util.Scanner;
import java.util.Random;
public class proj44 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nmass[][] = new int [20][10];
		Random random = new Random();
		int[][] omass = new int[10][20];
		for (int i=0; i<10; i++){
			for (int j=0; j<20; j++){
				omass[i][j] = random.nextInt(10);}
				}
	System.out.print("Созданный массив (старый)\n");	
		for (int i=0; i<10; i++){
			for (int j=0; j<20; j++){
					System.out.print(" "+omass[i][j]);
				}
			System.out.print("\n");
		}
		
		System.out.print("Созданный массив (новый)\n");	
		for (int i=0; i<20; i++){
			for (int j=0; j<10; j++){
					nmass[i][j]=omass[j][i];
					System.out.print(" "+nmass[i][j]);
				}
			System.out.print("\n");
		}
	in.close();
	}
}