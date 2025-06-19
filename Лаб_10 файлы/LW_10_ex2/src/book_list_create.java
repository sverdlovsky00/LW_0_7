import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class book_list_create {
    public static void create() {
        JSONArray books = new JSONArray();

        JSONObject book1 = new JSONObject();
        book1.put("id", 1);
        book1.put("title", "Война и мир");
        book1.put("author", "Лев Толстой");
        book1.put("year", 1869);

        JSONObject book2 = new JSONObject();
        book2.put("id", 2);
        book2.put("title", "Преступление и наказание");
        book2.put("author", "Фёдор Достоевский");
        book2.put("year", 1866);

        books.put(book1);
        books.put(book2);

        try (FileWriter file = new FileWriter("E:/Papka1/books.json")) {
            file.write(books.toString(4));
            System.out.println("Файл успешно создан.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
