import java.util.Scanner;

public class Timus12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] table = new char[n * 2 + 1][n * 2 + 1];

        // Чтение таблицы
        for (int i = 0; i < n * 2 + 1; i++) {
            String s = sc.next();
            for (int j = 0; j < n * 2 + 1; j++)
                table[i][j] = s.charAt(j);
        }

        // Изначально считаем количество плюсов
        int totalPluses = countPluses(table);

        // Определяем минимальное возможное количество плюсов
        int minPlusesRequired = Math.min(totalPluses, n * 2);

        // Если уже есть нужное количество плюсов или меньше, выводим "There is solution:"
        if (totalPluses <= minPlusesRequired) {
            System.out.println("There is solution:");
            return;
        }

        // Формируем список трансверсальных шагов
        boolean hasSolution = reducePluses(table, n, minPlusesRequired);

        if (!hasSolution) {
            System.out.println("No solution");
        } else {
            System.out.println("There is solution:");
        }
    }

    // Подсчет количества плюсов в таблице
    private static int countPluses(char[][] table) {
        int pluses = 0;
        for (char[] row : table) {
            for (char c : row) {
                if (c == '+')
                    pluses++;
            }
        }
        return pluses;
    }

    // Функция для переворота трансверсальной линии
    private static void flipTransversal(char[][] table, int row, int col) {
        table[row][col] ^= '+' ^ '-'; // XOR операция меняет '+' на '-' и наоборот
    }

    // Попытка уменьшить количество плюсов до нужного уровня
    private static boolean reducePluses(char[][] table, int n, int targetPluses) {
        while (countPluses(table) > targetPluses) {
            boolean flipped = false;
            for (int r = 0; r < n * 2 + 1 && !flipped; r++) {
                for (int c = 0; c < n * 2 + 1 && !flipped; c++) {
                    if (table[r][c] == '+') {
                        flipTransversal(table, r, c);
                        flipped = true;
                    }
                }
            }
            if (!flipped) break; // Больше нельзя перевернуть ни одного элемента
        }
        return countPluses(table) <= targetPluses;
    }
}