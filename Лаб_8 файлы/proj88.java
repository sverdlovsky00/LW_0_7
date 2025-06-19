package proj801;
import java.io.*;
import java.net.URL;
public class proj88 {
    // Метод для посимвольного чтения из Reader
    public static void readAllByChar(Reader in) throws IOException {
        int oneChar;
        while ((oneChar = in.read()) != -1) {
            System.out.print((char) oneChar);
        }
        System.out.println("\n--- конец источника ---\n");
    }

    public static void main(String[] args) {
        try {
            // --- Чтение из файла ---
            try (
                InputStream inFile = new FileInputStream("E:/MyFile2.txt");
                Reader rFile = new InputStreamReader(inFile, "cp1251")
            ) {
                System.out.println("Чтение из файла:");
                readAllByChar(rFile);
            }

            // --- Чтение из интернет-страницы ---
            try (
                InputStream inUrl = new URL("http://google.com").openStream();
                Reader rUrl = new InputStreamReader(inUrl, "cp1251")
            ) {
                System.out.println("Чтение из URL:");
                readAllByChar(rUrl);
            }

            // --- Чтение из массива байт ---
            byte[] byteArray = new byte[]{5, 8, 3, 9, 11};
            try (
                InputStream inArray = new ByteArrayInputStream(byteArray);
                Reader rArray = new InputStreamReader(inArray, "cp1251")
            ) {
                System.out.println("Чтение из массива байт:");
                readAllByChar(rArray);
            }

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}