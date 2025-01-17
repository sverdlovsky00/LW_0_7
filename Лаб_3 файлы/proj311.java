package proj301;
import java.util.Arrays;
import java.util.Scanner;
public class proj311 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num=10;
		char[] mass = new char [num];
		
		char a = 'a';
		for (int i=0; i<10; i++) {
			mass[i] = a;
			a++;
			a++;}
		
		
		System.out.print("Прямое отображение массива: ");
		for (int i=0; i<mass.length; i++) {
			System.out.printf(mass[i] + ", ");	
			}
		
		System.out.printf("\nОбратное отображение массива: ");
		for (int i=9; i>=0; i--) {
			System.out.print(mass[i] + ", ");	
			}
		
		in.close();
		}
}
