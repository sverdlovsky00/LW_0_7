import java.util.*;
import java.util.stream.*;

public class ex_9 {

    // Метод: возвращает строки, состоящие только из букв
    public static List<String> filterLettersOnly(List<String> strings) {
        return strings.stream()
                .filter(s -> s.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("Hello", "world", "Java123", "C++", "OnlyLetters", "No#Symbols", "abc");

        List<String> result = filterLettersOnly(input);

        System.out.println("Строки только из букв: " + result);
    }
}