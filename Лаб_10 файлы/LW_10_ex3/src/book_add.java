import org.apache.poi.xssf.usermodel.*;
import java.io.*;
import java.util.Scanner;

public class book_add {
    private final String path;

    public book_add(String path) {
        this.path = path;
    }

    public void addBooks() {
        try (FileInputStream fis = new FileInputStream(path);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {

            XSSFSheet sheet = workbook.getSheetAt(0);
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.print("Введите название книги (или 'exit' для выхода): ");
                String title = sc.nextLine();
                if (title.equalsIgnoreCase("exit")) break;

                System.out.print("Введите автора: ");
                String author = sc.nextLine();

                System.out.print("Введите год: ");
                int year = Integer.parseInt(sc.nextLine());

                int lastRow = sheet.getLastRowNum();
                int newId = lastRow;

                XSSFRow row = sheet.createRow(lastRow + 1);
                row.createCell(0).setCellValue(newId);
                row.createCell(1).setCellValue(title);
                row.createCell(2).setCellValue(author);
                row.createCell(3).setCellValue(year);

                try (FileOutputStream fos = new FileOutputStream(path)) {
                    workbook.write(fos);
                }

                System.out.println("Книга добавлена.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}