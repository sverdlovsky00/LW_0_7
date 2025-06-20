import java.util.*;

import java.util.Scanner;

public class Timus4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Количество кандидатов
        int M = scanner.nextInt(); // Количество избирателей

        // Массив для подсчета голосов
        int[] votes = new int[N];

        // Чтение списка голосов
        for (int i = 0; i < M; i++) {
            int candidate = scanner.nextInt() - 1; // Нумерация кандидатов начинается с 1
            votes[candidate]++;
        }

        // Вычисление процентов
        for (int i = 0; i < N; i++) {
            double percentage = (votes[i] * 100.0) / M;
            System.out.printf("%.2f\n", percentage);
        }
    }
}