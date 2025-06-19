import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.util.Scanner;

public class book_add {
    private final String path;

    public book_add(String path) {
        this.path = path;
    }

    public void addBooks() {
        try {
            File file = new File(path);
            JSONArray books;

            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                StringBuilder jsonText = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    jsonText.append(line);
                }
                books = new JSONArray(jsonText.toString());
            } else {
                books = new JSONArray();
            }

            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.print("Введите название книги (или 'exit' для выхода): ");
                String title = sc.nextLine();
                if (title.equalsIgnoreCase("exit")) break;

                System.out.print("Введите автора: ");
                String author = sc.nextLine();

                System.out.print("Введите год: ");
                int year = Integer.parseInt(sc.nextLine());

                int nextId = books.length() + 1;

                JSONObject book = new JSONObject();
                book.put("id", nextId);
                book.put("title", title);
                book.put("author", author);
                book.put("year", year);

                books.put(book);

                try (FileWriter writer = new FileWriter(path)) {
                    writer.write(books.toString(4));
                    System.out.println("Книга добавлена и файл обновлён.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}