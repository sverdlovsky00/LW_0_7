package proj401;
import java.util.Scanner;
import java.util.Random;
public class proj46 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nmass[][] = new int [9][9];
		Random random = new Random();
		int tmp1 = random.nextInt(10);
		int tmp2 = random.nextInt(10);
		int[][] omass = new int[10][10];
		for (int i=0; i<10; i++){
			for (int j=0; j<10; j++){
				omass[i][j] = random.nextInt(10);}
				}
	System.out.print("Созданный массив (старый)\n");	
		for (int i=0; i<10; i++){
			for (int j=0; j<10; j++){
					System.out.print(" "+omass[i][j]);
				}
			System.out.print("\n");
		}
	System.out.print("Удаляемая строка - " + tmp2 + ", удаляемый столбец - " +tmp1+"\n");	
		System.out.print("Созданный массив (новый)\n");	
		for (int i=0,m=0; i<9; i++,m++){
			if (m==tmp2) {m++;}
			for (int j=0,n=0; j<9; j++,n++){
				if (n==tmp1) {n++;}
				nmass[i][j]=omass[m][n];
			}
			
		};
		
		for (int i=0; i<9; i++){
			for (int j=0; j<9; j++){
				System.out.print(" "+nmass[i][j]);
				}
			System.out.print("\n");
		
	in.close();
	}
}
}