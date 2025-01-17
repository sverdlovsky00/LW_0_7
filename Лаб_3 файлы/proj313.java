package proj301;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class proj313 {
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
		
		int mini=0;
		int min = mass[0];
		for (int i=1; i<mass.length; i++) {
			if (mass[i]<min)	{min=mass[i];	mini=i;}
		}
		
		System.out.println("Минимальный элемент массива: "+min +" имеет индекс " +mini);				
		in.close();
		}
}
