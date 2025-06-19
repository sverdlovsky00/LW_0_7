package proj901;

import java.util.*;

public class proj913 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Время выполнения операции добавления в ArrayList = " + getRunningTime(arrayList) + " мс");
        System.out.println("Время выполнения операции добавления в LinkedList = " + getRunningTime(linkedList) + " мс");
    }

    private static long getRunningTime(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }
}