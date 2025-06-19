package proj901_8;

class Node {
    public int value;
    public Node next;
    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class MyLinkedList {
    private Node head;
    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.value).append(" ");
            current = current.next;
        }
        return sb.toString().trim();
    }
}

public class proj_a {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        System.out.println("Список: " + list);
    }
}