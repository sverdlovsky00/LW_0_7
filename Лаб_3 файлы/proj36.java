package proj301;
import java.util.Arrays;
import java.util.Scanner;
public class proj36 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 2;
		int[] mass = new int[num];
		for (int i=0; i<mass.length; i++) {
			System.out.println("Введите число с клавиатуры: ");
			mass[i]=in.nextInt();			
		}
		Arrays.sort(mass);
		System.out.println("Произведена сортировка массива");
		for (int i=0; i<mass.length; i++) {
			System.out.println("Элемент массива: " +i+ ": " +mass[i]);
		}
		in.close();
}
}