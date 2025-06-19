package proj901;
import java.util.Scanner;
public class proj96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int n = scanner.nextInt();

        System.out.print("Двоичное представление числа " + n + ": ");
        if (n == 0) {
            System.out.print("0");
        }if (n == 1) {
        	 System.out.print("1");
        }else {
            toBinary(n);
        }
        System.out.println();

        scanner.close();
    }

    public static void toBinary(int n) {
        if (n > 0) {
            toBinary(n / 2);
            System.out.print(n % 2);
        }
    }
}