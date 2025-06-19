import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.File;

public class create_the_list {

    public static void main(String[] args) {
        try {
            // 1. Создание "пустого" XML-документа
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();

            // 2. Корневой элемент <library>
            Element root = doc.createElement("library");
            doc.appendChild(root); // добавить корень в документ

            // 3. Первая книга
            Element book1 = doc.createElement("book");
            book1.setAttribute("id", "1");

            Element title1 = doc.createElement("title");
            title1.appendChild(doc.createTextNode("Война и мир"));
            book1.appendChild(title1);

            Element author1 = doc.createElement("author");
            author1.appendChild(doc.createTextNode("Лев Толстой"));
            book1.appendChild(author1);

            Element year1 = doc.createElement("year");
            year1.appendChild(doc.createTextNode("1869"));
            book1.appendChild(year1);

            root.appendChild(book1); // добавить книгу в <library>

            // 4. Вторая книга
            Element book2 = doc.createElement("book");
            book2.setAttribute("id", "2");

            Element title2 = doc.createElement("title");
            title2.appendChild(doc.createTextNode("Преступление и наказание"));
            book2.appendChild(title2);

            Element author2 = doc.createElement("author");
            author2.appendChild(doc.createTextNode("Фёдор Достоевский"));
            book2.appendChild(author2);

            Element year2 = doc.createElement("year");
            year2.appendChild(doc.createTextNode("1866"));
            book2.appendChild(year2);

            root.appendChild(book2); // добавить вторую книгу

            // 5. Сохранение XML-файла на диск
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            // Настройки форматирования
            transformer.setOutputProperty(OutputKeys.INDENT, "yes"); // отступы
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4"); // размер отступа

            DOMSource source = new DOMSource(doc); // откуда читать XML
            StreamResult result = new StreamResult(new File("E:/Papka1/list_of_books.xml")); // куда сохранить

            transformer.transform(source, result); // сохранить

            System.out.println("XML-файл создан успешно: list_of_books.xml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}