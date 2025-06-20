import java.util.*;

public class Timus6 {

    // Метод для проверки всех возможных перестановок цифр и нахождения подходящей
    private static String findPermutationDivisibleBySeven(String numberStr) {
        List<Character> digits = new ArrayList<>();
        char[] chars = numberStr.toCharArray();
        for (char c : chars) {
            if ("1234".indexOf(c) != -1 && !digits.contains(c)) {
                digits.add(c);   // добавляем уникальные цифры
            }
        }

        if (digits.size() != 4) return "0"; // проверка наличия ровно 4-х разных цифр

        // Генерация всех возможных перестановок
        List<String> permutations = generatePermutations(new ArrayList<>(digits));

        // Проверка каждой перестановки на кратность 7
        for (String perm : permutations) {
            int num = Integer.parseInt(perm);
            if (num % 7 == 0) {
                return perm;
            }
        }

        return "0";
    }

    // Рекурсивная функция для генерации всех перестановок
    private static List<String> generatePermutations(List<Character> digits) {
        List<String> result = new ArrayList<>();

        permute(result, digits, 0);
        return result;
    }

    // Вспомогательная рекурсивная функция для генерации перестановок
    private static void permute(List<String> result, List<Character> digits, int start) {
        if (start == digits.size()) {
            StringBuilder sb = new StringBuilder();
            for (Character ch : digits) {
                sb.append(ch);
            }
            result.add(sb.toString());
            return;
        }

        for (int i = start; i < digits.size(); ++i) {
            Collections.swap(digits, start, i);
            permute(result, digits, start + 1);
            Collections.swap(digits, start, i); // откатываем изменения
        }
    }

    // Основной метод программы
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // читаем количество чисел
        scanner.nextLine();          // пропускаем оставшуюся пустую строку

        while (n-- > 0) {
            String line = scanner.nextLine();
            System.out.println(findPermutationDivisibleBySeven(line));
        }
    }
}