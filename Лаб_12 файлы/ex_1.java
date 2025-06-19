import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class job1 {
    public static void main(String[] args) throws InterruptedException {
        // Запускаем первый поток
        new MyThread("Поток #1").start();

        // Запускаем второй поток
        new MyThread("Поток #2").start();

        // Ждем завершения потоков около 10 секунд
        Thread.sleep(10_000);
    }
}

class MyThread extends Thread {
    private final String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();  // Время начала работы потока

        while ((System.currentTimeMillis() - startTime) <= 10_000) {  // Работаем 10 секунд
            try {
                Thread.sleep(2000);  // Пауза между выводами — 2 секунды
            } catch (InterruptedException e) {
                break;
            }

            // Преобразуем миллисекунды в читаемое время
            LocalDateTime now = Instant.ofEpochMilli(System.currentTimeMillis())
                    .atZone(ZoneId.systemDefault())
                    .toLocalDateTime();

            System.out.println(name + ": Текущее время " + now.toString());
        }
    }
}