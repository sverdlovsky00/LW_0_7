import java.util.*;

public class Timus14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> graph = new ArrayList<>();

        // Инициализация графа
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // Чтение списка друзей для каждого члена группы
        for (int i = 1; i <= N; i++) {
            while (true) {
                int friend = scanner.nextInt();
                if (friend == 0) break;
                graph.get(i).add(friend);
                graph.get(friend).add(i); // Граф неориентированный
            }
        }

        // Массив для хранения цветов вершин
        int[] color = new int[N + 1];
        Arrays.fill(color, -1); // -1 означает, что вершина еще не раскрашена

        // Попытка раскрасить граф
        boolean possible = true;
        for (int i = 1; i <= N; i++) {
            if (color[i] == -1) {
                possible = possible && dfs(graph, color, i, 0);
            }
        }

        if (!possible) {
            System.out.println(0);
        } else {
            List<Integer> team1 = new ArrayList<>();
            List<Integer> team2 = new ArrayList<>();
            for (int i = 1; i <= N; i++) {
                if (color[i] == 0) {
                    team1.add(i);
                } else {
                    team2.add(i);
                }
            }
            System.out.println(team1.size());
            for (int member : team1) {
                System.out.print(member + " ");
            }
        }
    }

    // Функция для раскраски графа с помощью DFS
    private static boolean dfs(List<List<Integer>> graph, int[] color, int node, int currentColor) {
        color[node] = currentColor;
        for (int neighbor : graph.get(node)) {
            if (color[neighbor] == -1) {
                if (!dfs(graph, color, neighbor, 1 - currentColor)) {
                    return false;
                }
            } else if (color[neighbor] == currentColor) {
                return false;
            }
        }
        return true;
    }
}