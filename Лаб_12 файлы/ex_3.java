public class job3 {

    public static void main(String[] args) {
        // Поток для вывода чётных чисел
        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Четное число: " + i);
            }
        });

        // Поток для вывода нечётных чисел
        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 10; i += 2) {
                System.out.println("Нечетное число: " + i);
            }
        });

        // Запуск обоих потоков одновременно
        evenThread.start();
        oddThread.start();
    }
}