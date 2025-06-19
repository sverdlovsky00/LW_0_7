import java.util.*;
import java.util.stream.*;

public class ex_4
{

    public static List<Integer> squareList(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n) // возводим каждое число в квадрат
                .collect(Collectors.toList()); // собираем результат в список
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squared = squareList(input);

        System.out.println("Квадраты чисел: " + squared);
    }

}
