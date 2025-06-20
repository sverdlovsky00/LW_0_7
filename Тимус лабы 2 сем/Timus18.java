import java.util.*;

public class Timus18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();

        for (int i = 0; i < K; i++) {
            int a = scanner.nextInt();
            int n = scanner.nextInt();

            List<Integer> roots = findSquareRoots(a, n);

            if (roots.isEmpty()) {
                System.out.println("No root");
            } else {
                for (int root : roots) {
                    System.out.print(root + " ");
                }
                System.out.println();
            }
        }
    }

    // Функция для нахождения квадратных корней по модулю простого числа
    private static List<Integer> findSquareRoots(int a, int n) {
        List<Integer> roots = new ArrayList<>();

        // Перебор всех возможных значений x от 1 до n - 1
        for (int x = 1; x < n; x++) {
            // Проверка условия x^2 ≡ a (mod n)
            if ((x * x) % n == a) {
                roots.add(x);
            }
        }

        return roots;
    }
}