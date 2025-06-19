package proj901_8;

class MyLinkedListB {
    private Node head;

    public void createHeadRec(int[] values) {
        head = createHeadRecHelper(values, 0);
    }

    private Node createHeadRecHelper(int[] values, int index) {
        if (index >= values.length) return null;
        Node node = new Node(values[index]);
        node.next = createHeadRecHelper(values, index + 1);
        return node;
    }

    public void createTailRec(int[] values) {
        head = createTailRecHelper(values, 0);
    }

    private Node createTailRecHelper(int[] values, int index) {
        if (index >= values.length) return null;
        Node node = createTailRecHelper(values, index + 1);
        Node newNode = new Node(values[index]);
        newNode.next = node;
        return newNode;
    }

    public String toStringRec() {
        return toStringRecHelper(head).trim();
    }

    private String toStringRecHelper(Node node) {
        if (node == null) return "";
        return node.value + " " + toStringRecHelper(node.next);
    }
}

public class proj_b {
    public static void main(String[] args) {
        MyLinkedListB list = new MyLinkedListB();

        list.createHeadRec(new int[]{1, 2, 3});
        System.out.println("Рекурсивный ввод с головы: " + list.toStringRec());

        list.createTailRec(new int[]{4, 5, 6});
        System.out.println("Рекурсивный ввод с хвоста: " + list.toStringRec());
    }
}
