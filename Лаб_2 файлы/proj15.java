package proj201;
import java.util.Scanner;
public class proj15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число: ");
		int num = in.nextInt();
		if (num >= 1000) {
			System.out.println("В числе " +num+ " количество тысяч: " +(num/1000));
		}
		else 
		{System.out.println("Число " +num+ " меньше тысячи");}		
	}
					
	}
