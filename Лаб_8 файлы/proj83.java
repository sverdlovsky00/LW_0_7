package proj801;

import java.io.*;
import java.util.Arrays;

public class proj83 {

    public static void readAllByArray(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        while (true) {
            int count = in.read(buff);
            if (count != -1) {
                System.out.println("Количество = " + count + ", buff = "
                        + Arrays.toString(buff) + ", str = "
                        + new String(buff, 0, count, "cp1251")); // можно заменить на "UTF-8"
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        String fileName = "E:/Papka1/file1.txt";
        InputStream inFile = null;

        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch (IOException e) {
            System.out.println("Ошибка открытия-закрытия файла " + fileName + ": " + e);
        } finally {
            if (inFile != null) {
                try {
                    inFile.close();
                } catch (IOException ignore) {
                    // NOP
                }
            }
        }
    }
}