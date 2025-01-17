package proj301;
import java.util.Scanner;
public class proj31 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите номер дня недели: ");
		int num = in.nextInt();
		switch (num) {
			case 1: System.out.print("Это понедельник"); break;
			case 2: System.out.print("Это вторник"); break;
			case 3: System.out.print("Это среда"); break;
			case 4: System.out.print("Это четверг"); break;
			case 5: System.out.print("Это пятница"); break;
			case 6: System.out.print("Это суббота"); break;
			case 7: System.out.print("Это воскресенье"); break;
			default: System.out.print("Неверно введен номер");
		}
	in.close();
	}
}