import java.util.EmptyStackException;

public class ex3_5 {

	public static void main(String[] args) {
		int range = Integer.parseInt(args[0]);
		MyQueue<Integer> q = new MyQueue<Integer>();
		for (int i = 0; i < range; i++) {
			q.push(i);
		}
		for (int i = 0; i < range; i++) {
			System.out.println(q.pop());
		}

		try {
            q.pop();
        } catch (EmptyStackException e) {
			System.out.println("MyQueue<Integer> works");
        }

		q.push(0);
		q.push(1);
		q.push(2);
		System.out.println("Should be 0: " + q.pop());
		q.push(3);
		System.out.println("Should be 1: " + q.pop());
		System.out.println("Should be 2: " + q.pop());
		System.out.println("Should be 3: " + q.pop());
		try {
            q.pop();
        } catch (EmptyStackException e) {
			System.out.println("MyQueue<Integer> works");
        }
		q.push(0);
		System.out.println("Should be 0: " + q.peek());
	}
}
