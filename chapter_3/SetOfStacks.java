// This is for ex3_3

import java.lang.IndexOutOfBoundsException;

public class SetOfStacks {

    private Stack<Stack<Integer>> stack;
    // capacity
    private int cap, numStacks;

    public SetOfStacks(int cap) {
        this.stack = new Stack<Stack<Integer>>();
        this.cap = cap;
        this.numStacks = 0;
    }

    public void push(int i) {
        if (stack.isEmpty()) {
            Stack<Integer> s = new Stack<Integer>();
            s.push(i);
            stack.push(s);
            numStacks++;
        } else {
            Stack<Integer> s = stack.pop();
            if (s.size() == cap) {
                stack.push(s);
                Stack<Integer> temp = new Stack<Integer>();
                temp.push(i);
                stack.push(temp);
                numStacks++;
            } else {
                s.push(i);
                stack.push(s);
            }
        }
    }

    public int pop() {
        Stack<Integer> s = stack.pop();
        int ret = s.pop();
        if (s.isEmpty())
            numStacks--;
        else
            stack.push(s);
        return ret;
    }

    public int popAt(int index) {
        if (index >= numStacks)
            throw new IndexOutOfBoundsException();
        int diff = numStacks - index;
        Stack<Stack<Integer>> temp = new Stack<Stack<Integer>>();
        for (int i = 0; i < diff; i++) {
            temp.push(stack.pop());
        }
        Stack<Integer> s = temp.pop();
        int ret = s.pop();
        if (s.isEmpty())
            numStacks--;
        else
            stack.push(s);
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        return ret;
    }

    public int peek() {
        Stack<Integer> s = stack.pop();
        int ret = s.pop();
        s.push(ret);
        stack.push(s);
        return ret;
    }

    public void secretPrint() {
        Stack<Stack<Integer>> temp = new Stack<Stack<Integer>>();
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        int i = 0;
        while (!temp.isEmpty()) {
            Stack<Integer> s = temp.pop(), tempS = new Stack<Integer>();
            System.out.println("Stack number " + i++);
            while (!s.isEmpty()) {
                tempS.push(s.pop());
            }
            while (!tempS.isEmpty()) {
                int tempI = tempS.pop();
                System.out.println("\t" + tempI);
                s.push(tempI);
            }
            stack.push(s);
        }
    }
}
