package proj301;
import java.util.Arrays;
import java.util.Scanner;
public class proj38 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Введите количество элементов массива: ");
		int num = in.nextInt();
		if (num==0) {System.out.print("Число должно быть больше 0!"); System.exit(1);}
		int[] mass = new int[num];
		int a = 0;
		
		for (int i=0; i<mass.length; i++) {
				while (a%3!=1 & a%5!=2)	{a++;}
			mass[i]=a;	a++;
			}
		
		System.out.println("Элементы массива: ");
		for (int i=0; i<mass.length; i++) {
			System.out.print(mass[i] + ", ");
		}
		
		a=0;
		for (int i=0; i<mass.length; i++) {
			a=a+mass[i];
		}
		
		System.out.printf("Сумма элементов массива: " +a);
		
		in.close();
		}
}
