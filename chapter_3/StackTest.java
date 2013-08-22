import java.util.EmptyStackException;

public class StackTest {

	public static void main(String[] args) {
		int range = Integer.parseInt(args[0]);
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < range; i++) {
			s.push(i);
		}
		for (int i = 0; i < range; i++) {
			System.out.println(s.pop());
		}
        try {
            s.pop();
			System.out.println("Stack doesn't  work");
        } catch (EmptyStackException e) {
			System.out.println("Stack works");
        }
        int a = 0;
		for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.println("Pushing " + a);
                s.push(a++);
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.println("Pop " + s.pop());
            }
		}
        try {
            s.pop();
			System.out.println("Stack doesn't  work");
        } catch (EmptyStackException e) {
			System.out.println("Stack works");
        }
        
	}
}
