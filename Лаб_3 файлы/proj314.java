package proj301;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class proj314 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Введите количество элементов массива: ");
		int num = in.nextInt();
		if (num<=0) {System.out.print("Число должно быть больше 0!"); System.exit(1);}
		int[] mass = new int[num];
		int a = 0;	
		Random random = new Random();
		for (int i=0; i<mass.length; i++){
			mass[i] = random.nextInt(200);}
		
		System.out.println("Элементы массива: ");
			for (int i=0; i<mass.length; i++) {
				System.out.print(mass[i] + ", ");
			}
		
			Arrays.sort(mass);
		    int m = 0;
		    int j = mass.length-1;
		    int tmp;
		    while (j > m) {
		        tmp = mass[j];
		        mass[j] = mass[m];
		        mass[m] = tmp;
		        j--;
		        m++;
		    }
		    
		System.out.println("\nЭлементы массива в порядке убывания: ");
			for (int i=0; i<mass.length; i++) {
				System.out.print(mass[i] + ", ");
			}
					
		in.close();
		}
}
