package proj301;
import java.util.Arrays;
import java.util.Scanner;
public class proj34 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите количество чисел последовательности: ");
		int num = in.nextInt();
		if (num==0) {System.out.print("Число должно быть больше 0!"); System.exit(1);}
		int a = 1;	int b = 1; int c = 0;
		System.out.print("Числа Фибоначчи: " + a);
		if (num==1) {System.exit(1);}
		System.out.print(" " + b);
		if (num==2) {System.exit(1);}
		int i=3;
		while (i<=num) {
			c = a+b;
			b = a;
			a = c;
			i++;
			System.out.print(" " + c);}
		in.close();
	}

}
