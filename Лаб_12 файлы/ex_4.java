public class job4 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int threadNum = i; // Сохраняем номер потока локально внутри лямбды
            new Thread(() -> {
                System.out.println("Номер потока: " + threadNum);
            }).start();
        }
    }
}