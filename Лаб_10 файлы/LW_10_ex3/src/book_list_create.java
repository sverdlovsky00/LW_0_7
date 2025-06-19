import org.apache.poi.xssf.usermodel.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class book_list_create {
    public static void create() {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Books");

        Object[][] books = {
                {"ID", "Title", "Author", "Year"},
                {1, "Война и мир", "Лев Толстой", 1869},
                {2, "Преступление и наказание", "Фёдор Достоевский", 1866}
        };

        int rowNum = 0;
        for (Object[] bookData : books) {
            XSSFRow row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : bookData) {
                row.createCell(colNum++).setCellValue(field.toString());
            }
        }

        try (FileOutputStream outputStream = new FileOutputStream("E:/Papka1/books.xlsx")) {
            workbook.write(outputStream);
            System.out.println("Excel-файл успешно создан.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}