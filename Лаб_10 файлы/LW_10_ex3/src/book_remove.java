import org.apache.poi.xssf.usermodel.*;
import java.io.*;
import java.util.Scanner;

public class book_remove {
    private final String path;

    public book_remove(String path) {
        this.path = path;
    }

    public void removeBookById() {
        try (FileInputStream fis = new FileInputStream(path);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {

            XSSFSheet sheet = workbook.getSheetAt(0);
            Scanner sc = new Scanner(System.in);

            System.out.print("Введите ID книги для удаления: ");
            int idToRemove = Integer.parseInt(sc.nextLine());

            boolean removed = false;

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                XSSFRow row = sheet.getRow(i);
                if (row != null && row.getCell(0) != null &&
                        (int) row.getCell(0).getNumericCellValue() == idToRemove) {
                    sheet.removeRow(row);
                    removed = true;
                    break;
                }
            }

            try (FileOutputStream fos = new FileOutputStream(path)) {
                workbook.write(fos);
            }

            if (removed) {
                System.out.println("Книга удалена.");
            } else {
                System.out.println("Книга с таким ID не найдена.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}