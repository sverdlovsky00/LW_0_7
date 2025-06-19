import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;

import java.io.File;
import java.util.Scanner;

public class new_books {
    private final String path;

    public new_books(String path) {
        this.path = path;
    }


    public void add_books() {
        try {
            File xmlFile = new File(path);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbFactory.newDocumentBuilder();
            Document doc;

            Element root;

            if (xmlFile.exists()) {
                doc = builder.parse(xmlFile);
                doc.getDocumentElement().normalize();
                root = doc.getDocumentElement();
            } else {
                doc = builder.newDocument();
                root = doc.createElement("books");
                doc.appendChild(root);
            }

            Scanner sc = new Scanner(System.in);
            while (true) {
                NodeList nList = doc.getElementsByTagName("book");
                int next = nList.getLength() + 1;

                System.out.print("Введите имя новой книги или Exit для завершения: ");
                String title = sc.nextLine();
                if (title.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.print("Введите автора книги: ");
                String author = sc.nextLine();

                System.out.print("Введите год издания книги: ");
                String year = sc.nextLine();

                Element book = doc.createElement("book");
                book.setAttribute("id", String.valueOf(next));

                Element titleElem = doc.createElement("title");
                titleElem.appendChild(doc.createTextNode(title));
                book.appendChild(titleElem);

                Element authorElem = doc.createElement("author");
                authorElem.appendChild(doc.createTextNode(author));
                book.appendChild(authorElem);

                Element yearElem = doc.createElement("year");
                yearElem.appendChild(doc.createTextNode(year));
                book.appendChild(yearElem);

                root.appendChild(book);

                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.setOutputProperty("{http" +
                        "://xml.apache.org/xslt}indent-amount", "4");

                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File(path));
                transformer.transform(source, result);

                System.out.println("Успешное сохранение файла!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}