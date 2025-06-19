package proj801;
import java.io.*;
import java.net.*;
public class proj82 {

	public static void readAllByByte(InputStream in) throws IOException {
	    while (true) {
	        int oneByte = in.read();   // Чтение одного байта
	        if (oneByte != -1) {
	        	
	            System.out.print((char) oneByte);  // Преобразуем байт в символ и выводим его
	        } else {
	            System.out.print("\n" + "end");  // Если байты закончились, выводим "end"
	            break;  // Прерываем цикл
	        }
	    }
	}

    public static void main(String[] args) {
        try {
            // Чтение из файла
            InputStream inFile = new FileInputStream("E:/Papka1/file1.txt");
            readAllByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();

            // Чтение из URL
            InputStream inUrl = new URL("http://google.com").openStream();
            readAllByByte(inUrl);
            System.out.print("\n\n\n");
            inUrl.close();

            // Чтение из массива байтов
            InputStream inArray = new ByteArrayInputStream(new byte[]{7, 9, 3, 7, 4});
            readAllByByte(inArray);
            System.out.print("\n\n\n");
            inArray.close();

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}