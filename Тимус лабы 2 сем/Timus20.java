import java.util.Scanner;

public class Timus20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = scanner.nextInt();
        String prefix = scanner.next();

        // Генерация 12-значного числа, начинающегося с заданных цифр
        long number = Long.parseLong(prefix);
        while (number < 1000000000000L) {
            number *= 10;
        }

        // Поиск простого числа
        while (!isPrime(number)) {
            number++;
        }

        // Вывод результата
        System.out.println(number);
    }

    // Функция для проверки простоты числа
    private static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (long i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}