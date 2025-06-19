package proj901;
import java.util.HashMap;
import java.util.Map;
public class proj911 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "sixsix");
        map.put(7, "sevens");
        map.put(8, "eightt");
        map.put(9, "nine999");

        System.out.println("Строки, у которых ключ > 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getValue());
            }
        }

        if (map.containsKey(0)) {
            System.out.println("\nЗначение при ключе 0: " + map.get(0));
        }

        int product = 1;
        boolean found = false;
        for (Map.Entry<Integer, String>entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
                found = true;
            }
        }

        if (found) {
            System.out.println("\nПроизведение ключей, где длина строки > 5: " + product);
        } else {
            System.out.println("\nНет строк длиной больше 5 символов.");
        }
    }
}