public class ex2_3 {
    // the question isn't very clear, but I think by middle, they mean
    // node won't be the first or last element
    public static void deleteMiddle(Node node) {
        if (node == null)
            return;
        Node next = node.next;
        // I don't check for null, because node won't be the last element
        node.data = next.data;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        // 0 -> 1 -> 2 -> 3 -> 4 -> end
        Node head = Node.build(5);
        head.print();
        // 2
        Node middle = head.next.next;
        deleteMiddle(middle);
        head.print();
    }
}
