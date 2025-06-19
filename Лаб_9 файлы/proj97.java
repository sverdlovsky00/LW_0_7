package proj901;
import java.util.Scanner;
public class proj97 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        inputArray(array, 0, scanner);

        System.out.println("Вывод элементов массива:");
        printArray(array, 0);

        scanner.close();
    }

    // Рекурсивный метод для ввода элементов массива
    public static void inputArray(int[] array, int index, Scanner scanner) {
        if (index < array.length) {
            System.out.print("Элемент " + index + ": ");
            array[index] = scanner.nextInt();
            inputArray(array, index + 1, scanner);
        }
    }

    // Рекурсивный метод для вывода элементов массива
    public static void printArray(int[] array, int index) {
        if (index < array.length) {
            System.out.println("Элемент " + index + ": " + array[index]);
            printArray(array, index + 1);
        }
    }
}