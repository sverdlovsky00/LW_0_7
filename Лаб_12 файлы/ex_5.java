import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class job5 {

    public static int findMax(int[] numbers) throws Exception {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Массив пустой!");
        }

        // Определяем количество ядер процессора
        int coresCount = Runtime.getRuntime().availableProcessors();
        int segmentLength = Math.max(numbers.length / coresCount, 1);

        // Создаем пулы потоков, соответствующий количеству ядер
        ExecutorService executor = Executors.newFixedThreadPool(coresCount);

        // Список будущих результатов
        List<Future<Integer>> results = new ArrayList<>(coresCount);

        // Деление массива на сегменты и запуск потоков
        for (int i = 0; i < coresCount; i++) {
            int startIndex = i * segmentLength;
            int endIndex = Math.min((i + 1) * segmentLength, numbers.length);

            // Передача задачи потоку
            results.add(executor.submit(new MaxFinderTask(numbers, startIndex, endIndex)));
        }

        // Сбор результатов и определение максимального значения
        int globalMax = Integer.MIN_VALUE;
        for (Future<Integer> result : results) {
            int localMax = result.get(); // Забрать результат задачи
            if (localMax > globalMax) {
                globalMax = localMax;
            }
        }

        // Закрываем пул потоков
        executor.shutdown();

        return globalMax;
    }

    // Task для нахождения максимума в сегменте массива
    private static class MaxFinderTask implements Callable<Integer> {
        private final int[] numbers;
        private final int startIndex;
        private final int endIndex;

        public MaxFinderTask(int[] numbers, int startIndex, int endIndex) {
            this.numbers = numbers;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public Integer call() {
            int localMax = Integer.MIN_VALUE;
            for (int i = startIndex; i < endIndex; i++) {
                if (numbers[i] > localMax) {
                    localMax = numbers[i];
                }
            }
            return localMax;
        }
    }

    // Тестовая функция
    public static void main(String[] args) throws Exception {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int max = findMax(numbers);
        System.out.println("Максимальный элемент: " + max);
    }
}
