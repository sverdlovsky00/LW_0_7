import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.util.Scanner;

public class book_remove {
    private final String path;

    public book_remove(String path) {
        this.path = path;
    }

    public void removeBookById() {
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
            System.out.print("Введите ID книги для удаления: ");
            int idToRemove = Integer.parseInt(sc.nextLine());

            boolean removed = false;

            for (int i = 0; i < books.length(); i++) {
                if (books.getJSONObject(i).getInt("id") == idToRemove) {
                    books.remove(i);
                    removed = true;
                    break;
                }
            }

            if (removed) {
                FileWriter writer = new FileWriter(path);
                writer.write(books.toString(4));
                writer.close();
                System.out.println("Книга удалена.");
            } else {
                System.out.println("Книга с таким ID не найдена.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}