import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.*;

import java.io.File;
import java.util.Scanner;

public class search {
    private final String filePath;

    public search(String filePath) {
        this.filePath = filePath;
    }

    public void search_books() {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                System.out.println("Файл не найден: " + filePath);
                return;
            }

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();

            Scanner sc = new Scanner(System.in);
            System.out.print("Введите параметр для поиска (title/author/year): ");
            String crit = sc.nextLine().toLowerCase();
            System.out.print("Введите слово или число для поиска: ");
            String value = sc.nextLine().toLowerCase();

            NodeList bookList = doc.getElementsByTagName("book");
            boolean found = false;

            for (int i = 0; i < bookList.getLength(); i++) {
                Element book = (Element) bookList.item(i);

                String title = book.getElementsByTagName("title").item(0).getTextContent().toLowerCase();
                String author = book.getElementsByTagName("author").item(0).getTextContent().toLowerCase();
                String year = book.getElementsByTagName("year").item(0).getTextContent().toLowerCase();

                boolean match = switch (crit) {
                    case "title" -> title.contains(value);
                    case "author" -> author.contains(value);
                    case "year" -> year.contains(value);
                    default -> false;
                };

                if (match) {
                    found = true;
                    System.out.println("Книга найдена!");
                    System.out.println("ID книги: " + book.getAttribute("id"));
                    System.out.println("Название: " + title);
                    System.out.println("Автор: " + author);
                    System.out.println("Год: " + year);
                }
            }

            if (!found) {
                System.out.println("Книга не найдена!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}