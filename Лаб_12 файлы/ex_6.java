import java.util.concurrent.*;

public class job6 {

    public static long parallelSum(int[] array) throws Exception {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив пуст");
        }

        // Получаем количество ядер процессора
        int numberOfCores = Runtime.getRuntime().availableProcessors();

        // Длина сегмента для обработки одним потоком
        int segmentSize = (int) Math.ceil((double) array.length / numberOfCores);

        // Создание пула потоков
        ExecutorService executor = Executors.newFixedThreadPool(numberOfCores);

        // Коллекция для хранения задач и результатов
        Future<Long>[] results = new Future[numberOfCores];

        // Разбиваем массив на части и отправляем каждую часть на отдельное ядро
        for (int i = 0; i < numberOfCores; i++) {
            int start = i * segmentSize;
            int end = Math.min(start + segmentSize, array.length);
            results[i] = executor.submit(new SumTask(array, start, end));
        }

        // Ожидание завершения всех задач и получение результата
        long totalSum = 0;
        for (Future<Long> result : results) {
            totalSum += result.get(); // wait until the task is completed and add its result
        }

        // Завершение пула потоков
        executor.shutdown();

        return totalSum;
    }

    // Внутренний класс, представляющий задачу по подсчёту суммы части массива
    private static class SumTask implements Callable<Long> {
        private final int[] array;
        private final int start;
        private final int end;

        public SumTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        public Long call() {
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            return sum;
        }
    }

    // Точка входа для тестирования
    public static void main(String[] args) throws Exception {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long result = parallelSum(testArray);
        System.out.println("Сумма элементов массива: " + result);
    }
}