import java.util.*;
import java.lang.Math;

class Point {
    int x, y;
    public Point(int x, int y) { this.x = x; this.y = y; }

    // Метод для проверки равенства двух точек
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) return false;
        Point other = (Point) obj;
        return x == other.x && y == other.y;
    }

    // хеш-код для HashSet
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

public class Timus8 {
    private static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    // Проверка коллинеарности трёх точек
    private static boolean isCollinear(Point p1, Point p2, Point p3) {
        return ((p2.y - p1.y) * (p3.x - p2.x) == (p3.y - p2.y) * (p2.x - p1.x));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Количество городов
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points.add(new Point(x, y));
        }

        Set<List<Point>> lines = new HashSet<>(); // Хранение уникальных прямых

        // Поиск всех возможных прямых
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                List<Point> linePoints = new ArrayList<>();
                linePoints.add(points.get(i)); // Первая точка
                linePoints.add(points.get(j)); // Вторая точка

                // Добавляем остальные точки, лежащие на той же прямой
                for (int k = j+1; k < n; k++) {
                    if (isCollinear(points.get(i), points.get(j), points.get(k))) {
                        linePoints.add(points.get(k));
                    }
                }

                Collections.sort(linePoints, Comparator.comparingDouble((Point p) -> p.x));
                lines.add(linePoints); // Сохраняем прямую
            }
        }

        double totalLength = 0.0;

        // Суммируем длины дорог по каждому множеству коллинеарных точек
        for (List<Point> line : lines) {
            for (int i = 0; i < line.size()-1; i++) {
                totalLength += distance(line.get(i), line.get(i+1));
            }
        }

        System.out.println(Math.round(totalLength)); // Округлим итоговую длину до ближайшего целого значения
    }
}