package proj801;
import java.io.*;
public class proj87 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;

        try {
            // Открываем файл для чтения и создаем буфер
            br = new BufferedReader(new FileReader("E:/Papka1/file1.txt"), 1024);

            // Открываем файл для записи
            out = new BufferedWriter(new FileWriter("E:/MyFile2.txt"));

            int lineCount = 0;
            String s;

            // Чтение строк из файла
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s); // вывод строки в консоль

                out.write(s);        // запись строки в новый файл
                out.newLine();       // добавление перехода на новую строку
            }

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            // Закрытие потоков в блоке finally (гарантируется закрытие)
            if (br != null) br.close();
            if (out != null) {
                out.flush();
                out.close();
            }
        }
    }
}