import java.util.*;
import java.io.*;

public class Timus7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine()); // Количество записей
        String[] penguins = new String[n];           // Массив для хранения записей

        for (int i = 0; i < n; i++) {
            penguins[i] = reader.readLine().trim();
        }

        System.out.println(findMostPopularPenguin(penguins)); // Вызов метода и вывод результата
    }

    private static String findMostPopularPenguin(String[] penguins) {
        Map<String, Integer> frequency = new HashMap<>();

        for (String penguin : penguins) {
            frequency.put(penguin, frequency.getOrDefault(penguin, 0) + 1);
        }

        String mostPopularPenguin = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostPopularPenguin = entry.getKey();
            }
        }

        return mostPopularPenguin;
    }
}