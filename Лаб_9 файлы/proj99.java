package proj901;
public class proj99 {
    // Определение класса Node (узел односвязного списка)
    static class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        // Создаем 4 узла списка
        Node node0 = new Node(0, null);
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);
        // Связываем их между собой
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        // Перебираем список и выводим значения
        Node ref = node0;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
