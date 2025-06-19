import java.util.*;
import java.util.stream.*;

public class ex_2 {
    public static int[] find(int[] arr1, int[] arr2) {
        // Преобразуем второй массив в Set для быстрого поиска
        Set<Integer> set2 = Arrays.stream(arr2)
                .boxed()      // из int → Integer
                .collect(Collectors.toSet());

        // Фильтруем первый массив: оставляем только те, что есть во втором
        return Arrays.stream(arr1)
                .filter(set2::contains)
                .distinct()               // исключаем дубликаты
                .toArray();
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 2, 3};
        int[] array2 = {3, 4, 5, 6, 7, 3};

        int[] common = find(array1, array2);

        System.out.println("Общие элементы: " + Arrays.toString(common));
    }



}
