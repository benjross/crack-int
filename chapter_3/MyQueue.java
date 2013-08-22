// This is for ex3_5

import java.util.EmptyStackException;

public class MyQueue<T> {
    private Stack<T> stack1, stack2;
    private boolean inStack2;

    public MyQueue() {
        stack1 = new Stack<T>();
        stack2 = new Stack<T>();
        inStack2 = false;
    }

    public void push(T item) {
        if (inStack2) {
            while (!stack2.isEmpty())
                stack1.push(stack2.pop());
            inStack2 = false;
        }
        stack1.push(item);
    }

    public T pop() {
        if (stack1.isEmpty() && stack2.isEmpty()) 
            throw new EmptyStackException();
        putInStack2();
        T ret = stack2.pop();
        return ret;
    }

    public T peek() {
        if (stack1.isEmpty() && stack2.isEmpty()) 
            throw new EmptyStackException();
        putInStack2();
        return stack2.peek();
    }

    private void putInStack2() {
        if (!inStack2) {
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
            inStack2 = true;
        }
    }

    public int size() {
        return stack1.size() + stack2.size();
    }
    
    public boolean isEmpty() {
        return stack1.isEmpty() || stack2.isEmpty();
    }
}
