import java.util.*;

public class Timus3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Point[] points = new Point[N];

        // Чтение координат холмов
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points[i] = new Point(x, y, i + 1);
        }

        // Поиск выпуклой оболочки
        List<Point> convexHull = convexHull(points);

        // Выбор пяти точек
        if (convexHull.size() < 5) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            for (int i = 0; i < 5; i++) {
                System.out.print(convexHull.get(i).index + " ");
            }
            System.out.println();
        }
    }

    // Функция для поиска выпуклой оболочки
    private static List<Point> convexHull(Point[] points) {
        Arrays.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if (p1.x != p2.x) {
                    return Integer.compare(p1.x, p2.x);
                } else {
                    return Integer.compare(p1.y, p2.y);
                }
            }
        });

        List<Point> hull = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            while (hull.size() >= 2 && orientation(hull.get(hull.size() - 2), hull.get(hull.size() - 1), points[i]) <= 0) {
                hull.remove(hull.size() - 1);
            }
            hull.add(points[i]);
        }

        int t = hull.size() + 1;
        for (int i = points.length - 2; i >= 0; i--) {
            while (hull.size() >= t && orientation(hull.get(hull.size() - 2), hull.get(hull.size() - 1), points[i]) <= 0) {
                hull.remove(hull.size() - 1);
            }
            hull.add(points[i]);
        }

        hull.remove(hull.size() - 1);
        return hull;
    }

    // Функция для вычисления ориентации трёх точек
    private static int orientation(Point p, Point q, Point r) {
        int val = (q.y - p.y) * (r.x - q.x) - (q.x - p.x) * (r.y - q.y);
        if (val == 0) return 0;  // Коллинеарные точки
        return (val > 0) ? 1 : -1; // По часовой стрелке или против часовой стрелки
    }

    // Класс для представления точки
    static class Point {
        int x, y, index;

        Point(int x, int y, int index) {
            this.x = x;
            this.y = y;
            this.index = index;
        }
    }
}