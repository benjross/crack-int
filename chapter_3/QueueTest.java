public class QueueTest {

	public static void main(String[] args) {
		int range = Integer.parseInt(args[0]);
		Queue q = new Queue();
		for (int i = 0; i < range; i++) {
			q.push(i);
		}
		for (int i = 0; i < range; i++) {
			System.out.println(q.pop());
		}
		if (q.pop() == null)
			System.out.println("Queue works");

		q.push(0);
		q.push(1);
		q.push(2);
		System.out.println("Should be 0: " + q.pop());
		q.push(3);
		System.out.println("Should be 1: " + q.pop());
		System.out.println("Should be 2: " + q.pop());
		System.out.println("Should be 3: " + q.pop());
		if (q.pop() == null)
			System.out.println("Queue works");
		q.push(0);
		System.out.println("Should be 0: " + q.front);
	}
}
