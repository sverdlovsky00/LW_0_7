package proj801;
import java.io.*;
public class proj810 {
    public static void main(String[] args) {
        // Используем try-with-resources для автоматического закрытия потоков
        try (
            BufferedReader br = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream("E:/Papka1/file1.txt"), "cp1251")
            );
            PrintWriter out = new PrintWriter(
                new OutputStreamWriter(
                    new FileOutputStream("E:/Papka1/file2.txt"), "cp1251")
            )
        ) {
            int lineCount = 0;
            String s;

            // Чтение построчно и запись с добавлением номера строки
            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
            }

        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }
}
