package proj301;
import java.util.Arrays;
import java.util.Scanner;
public class proj39 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Введите количество элементов массива: ");
		int num = in.nextInt();
		if (num==0) {System.out.print("Число должно быть больше 0!"); System.exit(1);}
		int[] mass = new int[num];
		int a = 0;
		
		int i=0;
		while(i<mass.length){
			while (a%3!=1 & a%5!=2)	{a++;}
			mass[i]=a;	a++;	i++;
			}
				
		System.out.println("Элементы массива: ");
		i=0;
		while(i<mass.length){
			System.out.print(mass[i] + ", ");
			i++;
			}
				
		a=0;
				i=0;
		while(i<mass.length){
			a=a+mass[i];
			i++;
			}
		
		System.out.printf("Сумма элементов массива: " +a);
		
		in.close();
		}
}
