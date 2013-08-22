// This is for ex3_2

import java.util.EmptyStackException;
import java.util.ArrayList;

public class MinStack {

    private class MinNode {
        int value, min;
        MinNode(int value, int min) { this.value = value; this.min = min; }
    }

    ArrayList<MinNode> arr;
    int top;

    public MinStack() {
        arr = new ArrayList<MinNode>();
        top = -1;
    }

    public int pop() {
        if (top < 0)
            throw new EmptyStackException();
        return arr.get(top--).value;
    }

    public void push(int num) {
        MinNode node;
        if (top < 0 || num < min())
            node = new MinNode(num, num);
        else
            node = new MinNode(num, min());

        arr.add(++top, node);
    }		

    public int peek() {
        if (top < 0)
            throw new EmptyStackException();
        return arr.get(top).value;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int min() {
        if (top < 0)
            throw new EmptyStackException();
        return arr.get(top).min;
    }
}
