public class ex2_4 {
    public static Node add(Node node1, Node node2) {
        if (node1 == null && node2 == null)
            return null;
        if (node1 == null)
            return node2;
        if (node2 == null)
            return node1;
        int sum = node1.data + node2.data, rem = sum / 10;
        Node node = new Node(sum%10);
        Node head = node;
        node1 = node1.next;
        node2 = node2.next;
        while (node1 != null || node2 != null) {
            sum  = rem +
                ((node1 == null) ? 0 : node1.data) +
                ((node2 == null) ? 0 : node2.data);
            node.next =  new Node(sum%10);
            rem = sum / 10;
            node1 = (node1 == null) ? null : node1.next;
            node2 = (node2 == null) ? null : node2.next;
            node = node.next;
        } 
        return head;
    }
    public static void main(String[] args) {
        Node head1 = new Node(3);
        head1.next = new Node(1);
        head1.next.next = new Node(5);

        Node head2 = new Node(5);
        head2.next = new Node(9);
        head2.next.next = new Node(2);

        head1.print();
        head2.print();
        add(head1, head2).print();

        Node head3 = Node.build(10);
        head1.print();
        head3.print();
        add(head1, head3).print();
        add(null, null);
        head3.print();
        add(null, head3).print();
    }
}
