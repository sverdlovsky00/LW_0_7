import java.util.*;

public class Timus5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Количество компьютеров

        // Массив для хранения координат компьютеров
        double[][] coordinates = new double[N][2];

        // Построение планарного графа
        for (int i = 0; i < N; i++) {
            coordinates[i][0] = i * 2; // Координата x
            coordinates[i][1] = 0; // Координата y
        }

        // Вывод результата
        for (int i = 0; i < N; i++) {
            System.out.println(coordinates[i][0] + " " + coordinates[i][1]);
        }
    }
}