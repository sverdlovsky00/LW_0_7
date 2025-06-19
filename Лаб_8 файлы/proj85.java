package proj801;

import java.io.*;
import java.util.*;

public class proj85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя файла => ");
        String fname = sc.nextLine();

        try {
            File f1 = new File(fname);
            f1.createNewFile();

            System.out.println("Полный путь файла: " + f1.getAbsolutePath());

            System.out.print("Введите количество строк => ");
            int n = sc.nextInt();
            sc.nextLine(); // очистка буфера

            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));

            for (int i = 0; i < n; i++) {
                System.out.print("Введите строку => ");
                String s = sc.nextLine();
                dOut.writeUTF(s); // записывает строку в бинарном формате
            }

            dOut.flush();
            dOut.close();

            // Чтение из файла
            DataInputStream dIn = new DataInputStream(new FileInputStream(f1));

            while (true) {
                try {
                    String line = dIn.readUTF();
                    System.out.println("Прочитано: " + line);
                } catch (EOFException e) {
                    break;
                }
            }

            dIn.close();

        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
        }
        sc.close();
    }
}