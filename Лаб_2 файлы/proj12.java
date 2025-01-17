package proj201;
import java.util.Scanner;
public class proj12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число: ");
		int num = in.nextInt();
		if (num % 5 != 2) {
			System.out.println("При делении числа " +num+ " на 5, остаток не равен 2");
		}
		else if (num % 7 != 1) {
			System.out.println("При делении числа " +num+ " на 7, остаток не равен 1");
		}
		else 
		{System.out.println("Число " +num+ " удовлетворяет двум условиям");}		
	}
					
	}
