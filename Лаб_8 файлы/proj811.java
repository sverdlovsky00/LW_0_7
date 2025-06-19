package proj801;
import java.io.*;

public class proj811 {
    public static void main(String[] args) {
        String file1Path = "E:/Papka1/FileLW1.txt";
        String file2Path = "E:/Papka1/FileLW2.txt";

        double num1 = 3.14;
        double num2 = 666.666;
        double num3 = -99.9;
        double num4 = 36.9;
        double num5 = -75623.837;

        try {
            // Создание первого файла
            File f1 = new File(file1Path);
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("Файл FileLW1 создан!");
                System.out.println("Полный путь: " + f1.getAbsolutePath());
            }

            // Создание второго файла
            File f2 = new File(file2Path);
            f2.createNewFile();
            if (f2.exists()) {
                System.out.println("Файл FileLW2 создан!");
                System.out.println("Полный путь: " + f2.getAbsolutePath());
            }

            // Запись в первый файл
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(f1))) {
                writer.write("А этот файл у нас...");
                writer.newLine();
                writer.write("... для лабораторной работы!!!");
                writer.newLine();
                writer.write(num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);
                writer.flush();
            }

            // Чтение из первого и запись результатов во второй файл
            try (
                BufferedReader br = new BufferedReader(new FileReader(f1));
                BufferedWriter out = new BufferedWriter(new FileWriter(f2))
            ) {
                String firstLine = br.readLine();      // Первая строка
                String secondLine = br.readLine();     // Вторая строка

                // Записываем вторую строку
                if (secondLine != null) {
                    out.write(secondLine);
                    out.newLine();
                }

                // Чтение и фильтрация чисел
                String numberLine = br.readLine();
                if (numberLine != null) {
                    String[] parts = numberLine.split(",");
                    for (String part : parts) {
                        try {
                            double num = Double.parseDouble(part.trim());
                            if (num > 0) {
                                out.write(String.valueOf(num));
                                out.newLine();
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Не удалось прочитать число: " + part);
                        }
                    }
                }

                out.flush();
                System.out.println("Результаты записаны в " + f2.getAbsolutePath());
            }

        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }
}