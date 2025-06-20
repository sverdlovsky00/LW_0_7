import java.util.Scanner;

public class Timus11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine().trim());
        Point[] points = new Point[N];

        for(int i = 0; i < N; i++) {
            String[] parts = scanner.nextLine().trim().split(" ");
            points[i] = new Point(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
        }

        System.out.println(findMaxCollinearPoints(points));
    }

    private static int findMaxCollinearPoints(Point[] points) {
        int maxCount = 0;

        for(int i = 0; i < points.length; i++) {
            for(int j = i + 1; j < points.length; j++) {
                int count = 0;

                // Вычисляем направляющий вектор от первой ко второй точке
                long dx = points[j].x - points[i].x;
                long dy = points[j].y - points[i].y;

                // Проходим по остальным точкам и проверяем принадлежность прямой
                for(int k = 0; k < points.length; k++) {
                    if(k == i || k == j) continue;

                    // Если три точки коллинеарны, разности будут пропорциональны
                    if((dy * (points[k].x - points[i].x)) == (dx * (points[k].y - points[i].y))) {
                        count++;
                    }
                }

                // Добавляем сами исходные точки
                count += 2;
                maxCount = Math.max(count, maxCount);
            }
        }

        return maxCount;
    }

    // Класс для хранения координат точки
    private static class Point {
        final int x;
        final int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}