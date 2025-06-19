import java.util.*;
import java.util.stream.*;

public class ex_5 {

    public static List<String> filterBySubstring(List<String> input, String substring) {
        return input.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "grape", "pineapple", "orange");

        String search = "apple";

        List<String> result = filterBySubstring(words, search);

        System.out.println("Строки, содержащие '" + search + "': " + result);
    }

}
