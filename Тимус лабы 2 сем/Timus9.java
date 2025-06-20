import java.util.Scanner;

public class Timus9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Читаем входные данные
        int a = scanner.nextInt(); // Начальная цена Пети
        int b = scanner.nextInt(); // Надбавка Пети
        int c = scanner.nextInt(); // Начальная цена таксиста
        int d = scanner.nextInt(); // Скидка таксиста

        // Проверяем условие окончания торговли
        while ((c > a + b && a <= c - d)) {
            a += b;      // Петя повышает цену
            c -= d;      // Таксист снижает цену
        }

        if (a >= c) {
            System.out.println(c);  // Итоговая цена совпадает с предложением таксиста
        } else {
            System.out.println(a);  // Итоговая цена совпадает с предложением Пети
        }
    }
}