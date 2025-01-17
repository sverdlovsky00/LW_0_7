package proj301;
import java.util.Scanner;
public class proj32 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите название дня недели (с заглавной буквы): ");
		String day = in.nextLine();
		switch (day) {
			case "Понедельник": System.out.print("Номер дня недели - 1"); break;
			case "Вторник": System.out.print("Номер дня недели - 2"); break;
			case "Среда": System.out.print("Номер дня недели - 3"); break;
			case "Четверг": System.out.print("Номер дня недели - 4"); break;
			case "Пятница": System.out.print("Номер дня недели - 5"); break;
			case "Суббота": System.out.print("Номер дня недели - 6"); break;
			case "Воскресенье": System.out.print("Номер дня недели - 7"); break;
			default: System.out.print("Неверно введено название");
		}
	in.close();
	}
}
