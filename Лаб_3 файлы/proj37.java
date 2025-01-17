package proj301;
import java.util.Arrays;
import java.util.Scanner;
public class proj37 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 2;
		int[] mass = new int[num];
		int i = 0;
		while (i<mass.length) {
			System.out.println("Введите число с клавиатуры: ");
			mass[i]=in.nextInt();
			i++;}
		
		Arrays.sort(mass);
		System.out.println("Произведена сортировка массива");
		i=0;
		do {
			System.out.println("Элемент массива: " +i+ ": " +mass[i]);	i++;}
		while (i<num);
		in.close();
		}
}