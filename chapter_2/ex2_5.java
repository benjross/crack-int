import java.util.HashMap;

public class ex2_5 {
	public static Node getLoopBeginning(Node node) {
		if (node == null)
			return null;
		HashMap<Node, Boolean> visited = new HashMap<Node, Boolean>();
		while (node != null) {
			if (visited.containsKey(node))
				return node;
			visited.put(node, true);
			node = node.next;
		}
		return null;
	}
	
	public static void main(String[] args) {
		Node head = Node.build(5);
		System.out.println("0 -> 1 -> 2 -> 3 -> 4 -> 2 -> ...");
		head.next.next.next.next.next = head.next.next;
		System.out.println(getLoopBeginning(head).data);
		System.out.println("3 -> 3 -> 4 -> 5 -> 4 -> ...");
		Node head2 = new Node(3);
		head2.next = new Node(3);
		head2.next.next = new Node(4);
		head2.next.next.next = new Node(5);
		head2.next.next.next.next = head2.next.next;
		System.out.println(getLoopBeginning(head2).data);
	}
}
