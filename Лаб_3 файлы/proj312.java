package proj301;
import java.util.Arrays;
import java.util.Scanner;
public class proj312 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num=10;
		char[] mass = new char [num];
		
		char a = 'B';
		int i = 0;
		while (i<10) {
			if(a=='E'||a=='I')	{a++;}
			mass[i] = a;
			a++;
			i++;}
				
		System.out.print("Прямое отображение массива: ");
		for (int j=0; j<mass.length; j++) {
			System.out.printf(mass[j] + ", ");	
			}
		
		in.close();
		}
}