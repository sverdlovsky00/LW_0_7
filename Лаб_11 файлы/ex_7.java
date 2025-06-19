import java.util.*;
import java.util.stream.*;

public class ex_7 {

    public static List<String> filterByLength(List<String> strings, int minLength) {
        return strings.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("Java", "C", "Python", "Go", "JavaScript", "AI");

        int minLength = 3;

        List<String> result = filterByLength(input, minLength);

        System.out.println("Строки длиной больше " + minLength + ": " + result);
    }

}
