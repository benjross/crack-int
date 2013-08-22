import java.util.EmptyStackException;
import java.util.ArrayList;

public class Stack<T> {
    ArrayList<T> arr;
	int top;

	public Stack() {
		arr = new ArrayList<T>();
		top = -1;
	}
	
	public T pop() {
		if (top < 0)
			throw new EmptyStackException();
		return arr.get(top--);
	}

	public void push(T num) {
		arr.add(++top, num);
	}		

    public T peek() {
		if (top < 0)
			throw new EmptyStackException();
        return arr.get(top);
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public String toString() {
        String s = "bottom";
        for (T t: arr) {
            s += " " + t.toString();
        }
        s += " top";
    }
}
