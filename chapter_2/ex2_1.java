import java.util.TreeSet;
public class ex2_1 {

    public static void removeDuplicates(Node head) {
        TreeSet<Integer> encountered = new TreeSet<Integer>();
        Node node = head;
        if (node != null) {
            encountered.add(node.data);
        }
        while (node != null && node.next != null) {
            int data = node.next.data;
            if (!encountered.contains(data)) {
                encountered.add(data);
            } else {
                node.next = node.next.next;
            }
            node = node.next;
        }
    }

    public static Node removeDuplicatesNoBuf(Node head) {
        if (head == null)
            return head;
        Node node = head.next;
        while (node != null) {
            if (node.data == head.data) {
                head = head.next;
                node = head.next;
            } else {
                node = node.next;
            }
        }
        node = head.next;
        while (node != null) {
            Node other = node.next;
            // gets rid of sequentual repeats
            while (other != null  && other.data == node.data) {
                node.next = other.next;
                other = other.next;
            }
            while (other != null && other.next != null) {
                if (other.next.data == node.data) {
                    other.next = other.next.next;
                }
                other = other.next;
            }
            node = node.next;
        }
        return head;
    }

    public static void main(String[] args) {
        // 0 -> 2 -> 0 -> end
        Node head = new Node(0);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.print();
        head = removeDuplicatesNoBuf(head);
        head.print();
        // 0 -> 0 -> 0 -> end
        head = new Node(0);
        head.next = new Node(0);
        head.next.next = new Node(0);
        head.print();
        head = removeDuplicatesNoBuf(head);
        head.print();
        // 0 -> 0 -> 0 -> 1 -> end
        head = new Node(0);
        head.next = new Node(0);
        head.next.next = new Node(0);
        head.next.next.next = new Node(1);
        head.print();
        head = removeDuplicatesNoBuf(head);
        head.print();
        // 0 -> 1 -> 2 -> 1 -> end
        head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        head.print();
        head = removeDuplicatesNoBuf(head);
        head.print();
        // 0 -> 1 -> 0 -> 1 -> end
        head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(0);
        head.next.next.next = new Node(1);
        head.print();
        head = removeDuplicatesNoBuf(head);
        head.print();
    }
}
