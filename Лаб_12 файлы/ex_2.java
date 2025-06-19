public class job2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Задержка на 1 секунда
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new job2(), "Number Printer");
        thread.start();
    }
}
