import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;

import java.io.File;
import java.util.Scanner;

public class book_remove {
    private final String filePath;

    public book_remove(String filePath) {
        this.filePath = filePath;
    }

    public void remove_books_ID() {
        try {
            File file = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbFactory.newDocumentBuilder();
            Document doc = builder.parse(file);
            doc.getDocumentElement().normalize();

            Scanner sc = new Scanner(System.in);
            System.out.print("Введите ID книги, которую удалить: ");
            String ID_del = sc.nextLine();

            NodeList bookList = doc.getElementsByTagName("book");
            boolean removed = false;
            for (int i = 0; i < bookList.getLength(); i++) {
                Element book = (Element) bookList.item(i);
                if (book.getAttribute("id").equals(ID_del)) {
                    book.getParentNode().removeChild(book);
                    removed = true;
                    break;
                }
            }
            if (removed) {
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
                System.out.println("Книга успешно удалена!");
            }

            else  {
                System.out.println("Книга не найдена!");
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }

}