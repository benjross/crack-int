public class Node {
    Node next;
    int data;
    public Node(int data) {
        this.data = data;
    }

    public void add(int data) {
        Node node = this;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node(data);
    }

    public static Node build(int range) {
        if (range <= 0)
            return null;
        Node head = new Node(0);
        Node node = head;
        for (int i = 1; i < range; i++) {
            node.next = new Node(i);
            node = node.next;
        }
        return head;
    }

    public void print() {
        Node node = this;
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("end");
    }
}
