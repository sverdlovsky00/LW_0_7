package proj901;

public class proj98 {

    // Вложенный класс Node (узел односвязного списка)
    static class Node {
        public int value;
        public Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Метод для вывода списка (рекурсивно)
    public static void printList(Node node) {
        if (node != null) {
            System.out.println(node.value);
            printList(node.next);
        }
    }

    // 🚀 Точка входа — без неё ничего не запустится
    public static void main(String[] args) {
        Node third = new Node(30, null);
        Node second = new Node(20, third);
        Node first = new Node(10, second);

        System.out.println("Выводим список:");
        printList(first);
    }
}
