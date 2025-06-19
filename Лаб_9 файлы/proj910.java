package proj901;

public class proj910 {

    static class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Node head = null;

        // Создаём список из чисел от 9 до 0 (вставка в начало)
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }

        // Печатаем список
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        } 
    }
}