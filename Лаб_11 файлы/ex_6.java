import java.util.*;
import java.util.stream.*;

public class ex_6 {

    public static List<Integer> filterDivisible(List<Integer> numbers, int divisor) {
        return numbers.stream()
                .filter(n -> n % divisor == 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(10, 15, 20, 25, 30, 33, 40);
        int divisor = 5;

        List<Integer> result = filterDivisible(input, divisor);

        System.out.println("Числа, делящиеся на " + divisor + ": " + result);
    }

}
