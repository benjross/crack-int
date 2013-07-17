public class StackTest {

	public static void main(String[] args) {
		int range = Integer.parseInt(args[0]);
		Stack s = new Stack();
		for (int i = 0; i < range; i++) {
			s.push(i);
		}
		for (int i = 0; i < range; i++) {
			System.out.println(s.pop());
		}
		if (s.pop() == null)
			System.out.println("Stack works");
	}
}
