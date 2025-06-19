import java.util.*;
import java.util.stream.*;

public class ex_3 {

    public static List<String> filter(List<String> input) {
        return input.stream()
                .filter(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "banana", "Cherry", "dog", "Elephant", "");

        List<String> capitalized = filter(words);

        System.out.println("Строки с заглавной буквы: " + capitalized);
    }

}
