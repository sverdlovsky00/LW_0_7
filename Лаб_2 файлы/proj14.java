package proj201;
import java.util.Scanner;
public class proj14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число: ");
		int num = in.nextInt();
		if (num >= 5) {
			if (num <= 10 ) {
				System.out.println("Число " +num+ " больше или равно 5 и меньше или равно 10");
			}
			else 
			{System.out.println("Число " +num+ " меньше 5 или больше 10");}		
			
		}
	}
					
	}