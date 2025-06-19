package proj801;
import java.io.*;
public class proj86 {
    public static void main(String[] args) {
        Reader in = null;
        Writer out = null;

        try {
            // Открываем файл для чтения
            in = new FileReader("E:/Papka1/file1.txt");

            // Открываем файл для записи (true — добавление в конец)
            out = new FileWriter("E:/MyFile2.txt", true);

            int oneChar;

            // Считываем по одному символу, пока не достигнем конца файла
            while ((oneChar = in.read()) != -1) {
                out.append((char) oneChar);            // Запись в файл
                System.out.print((char) oneChar);      // Вывод на экран
            }

            System.out.println("\nКопирование завершено.");

        } catch (IOException e) {
            System.out.println("Произошла ошибка при работе с файлами: " + e.getMessage());
        } finally {
            try {
                if (in != null) in.close();    // Закрытие потока чтения
                if (out != null) out.close();  // Закрытие потока записи
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии файлов: " + e.getMessage());
            }
        }
    }
}