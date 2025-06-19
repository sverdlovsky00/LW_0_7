import java.util.*;
import java.util.stream.*;

public class lw_10 {

    // Метод: фильтрует числа, которые меньше заданного значения
    public static List<Integer> filterLessThan(List<Integer> numbers, int maxValue) {
        return numbers.stream()
                .filter(n -> n < maxValue)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(3, 8, 12, 5, 1, 20);

        int maxValue = 10;

        List<Integer> result = filterLessThan(input, maxValue);

        System.out.println("Числа меньше " + maxValue + ": " + result);
    }
}
