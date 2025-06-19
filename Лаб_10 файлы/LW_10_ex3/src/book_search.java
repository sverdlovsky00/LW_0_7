import org.apache.poi.xssf.usermodel.*;
import java.io.*;
import java.util.Scanner;

public class book_search {
    private final String path;

    public book_search(String path) {
        this.path = path;
    }

    public void searchBooks() {
        try (FileInputStream fis = new FileInputStream(path);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {

            XSSFSheet sheet = workbook.getSheetAt(0);
            Scanner sc = new Scanner(System.in);

            System.out.print("Введите параметр поиска (title/author/year): ");
            String field = sc.nextLine().toLowerCase();
            System.out.print("Введите значение: ");
            String value = sc.nextLine().toLowerCase();

            int colIndex = switch (field) {
                case "title" -> 1;
                case "author" -> 2;
                case "year" -> 3;
                default -> -1;
            };

            if (colIndex == -1) {
                System.out.println("Неверный параметр.");
                return;
            }

            boolean found = false;

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                XSSFRow row = sheet.getRow(i);
                if (row == null || row.getCell(colIndex) == null) continue;

                String cellValue = row.getCell(colIndex).toString().toLowerCase();
                if (cellValue.contains(value)) {
                    found = true;
                    System.out.println("Найдена книга:");
                    System.out.println("ID: " + row.getCell(0));
                    System.out.println("Название: " + row.getCell(1));
                    System.out.println("Автор: " + row.getCell(2));
                    System.out.println("Год: " + row.getCell(3));
                    System.out.println("----------");
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