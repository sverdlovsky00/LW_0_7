import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class book_search {
    private final String path;

    public book_search(String path) {
        this.path = path;
    }

    public void searchBooks() {
        try {
            File file = new File(path);
            if (!file.exists()) {
                System.out.println("Файл не найден.");
                return;
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder jsonText = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonText.append(line);
            }

            JSONArray books = new JSONArray(jsonText.toString());

            Scanner sc = new Scanner(System.in);
            System.out.print("Введите параметр поиска (title/author/year): ");
            String crit = sc.nextLine().toLowerCase();
            System.out.print("Введите значение: ");
            String value = sc.nextLine().toLowerCase();

            boolean found = false;

            for (int i = 0; i < books.length(); i++) {
                JSONObject book = books.getJSONObject(i);
                String field = book.getString(crit).toLowerCase();

                if (field.contains(value)) {
                    found = true;
                    System.out.println("Книга найдена:");
                    System.out.println("ID: " + book.getInt("id"));
                    System.out.println("Название: " + book.getString("title"));
                    System.out.println("Автор: " + book.getString("author"));
                    System.out.println("Год: " + book.getInt("year"));
                }
            }

            if (!found) {
                System.out.println("Книга не найдена.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}