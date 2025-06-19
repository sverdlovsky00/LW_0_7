import java.util.Arrays;

public class ex_1 {

    public static int[] filter(int[] numbers) {
        return Arrays.stream(numbers)            // создаём поток из массива
                .filter(n -> n % 2 == 0)    // фильтруем только чётные
                .toArray();                 // преобразуем поток обратно в массив
    }

    public static void main(String[] args) {
        int[] in = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] simpleNums = filter(in);

        // Выводим результат
        System.out.println("Чётные числа: " + Arrays.toString(simpleNums));
    }
}