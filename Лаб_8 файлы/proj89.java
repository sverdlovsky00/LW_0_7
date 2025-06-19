package proj801;
import java.io.*;
public class proj89 {
    public static void main(String[] args) {
        String inputFile = "E:/Papka1/file1.txt";
        String outputFile = "E:/Papka1/file2.txt";

        // try-with-resources — потоки автоматически закроются
        try (
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(inputFile), "cp1251"));

            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(outputFile), "cp1251"))
        ) {
            int lineCount = 0;
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;
                String numberedLine = lineCount + ": " + line;

                System.out.println(numberedLine);  // вывод в консоль
                bw.write(numberedLine);           // запись в файл
                bw.newLine();                     // переход на новую строку
            }

            bw.flush(); // не обязательно, но полезно для уверенности

        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }
}