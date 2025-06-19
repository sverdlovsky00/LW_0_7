import java.util.*;
import java.util.stream.*;


public class ex_8 {

    public static List<Integer> filterGreaterThan(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .filter(n -> n > threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(5, 10, 15, 3, 20, 1);

        int threshold = 10;

        List<Integer> result = filterGreaterThan(input, threshold);

        System.out.println("Числа больше " + threshold + ": " + result);
    }

}
