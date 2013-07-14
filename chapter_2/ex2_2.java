public class ex2_2 {
    public static Node nthToLast(Node head, int n) {
        if (head == null)
            return null;
        Node node = head;
        Node runner = head;
        for (int i = 0; i < n; i++) {
            if (runner.next == null)
                break;
            runner = runner.next;
        }
        //runner won't be null at this point
        while (runner.next != null) {
            runner = runner.next;
            node = node.next;
        }
        return node;
    }

    
    public static void main(String[] args) { 
        Node head = Node.build(10);
        head.print();
        for (int i = 0; i < 15; i++) {
            System.out.println(i +"th to last is : " + nthToLast(head, i).data);
        }
    }
}
