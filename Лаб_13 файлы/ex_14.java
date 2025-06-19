public class ex_14 {
    public static int m(int x) throws ArithmeticException {
        return 10 / x;
    }

    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("размер массива = " + l);
            int result = m(l);
            System.out.println("Результат деления 10 / " + l + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        }
    }
}
