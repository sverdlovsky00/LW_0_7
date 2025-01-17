package proj201;
import java.util.Scanner;
public class proj13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число: ");
		int num = in.nextInt();
		if (num % 4 == 0) {
			if (num > 10 ) {
				System.out.println("Число " +num+ " делится на 4 и оно больше 10");
			}
			else 
			{System.out.println("Число " +num+ " не делится на 4, или оно меньше 10");}		
			
		}
	}
					
	}