package proj201;
import java.util.Scanner;
public class proj11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число: ");
		int num = in.nextInt();
		if (num % 3 == 0)
			System.out.println("Число " +num+ " кратно 3");
		else
			System.out.println("Число " +num+  " не кратно 3");
		
	}

}
