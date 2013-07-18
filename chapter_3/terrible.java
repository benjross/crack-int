// This is the solution in the book to ex3_1.  There's a lot wrong with it
// Also, in their example they use call the three stacks: stack 1, stack 2, and stack 3, but
// the code is supposed to use zero-based numbering :/
public class terrible {
	int stackSize = 300;
	int[] buffer = new int [stackSize * 3];
	int[] stackPointer = {0, 0, 0}; // stack pointers to track top elem

	void push(int stackNum, int value) {
		/* Find the index of the top element in the array + 1, and * increment the stack pointer */
		int index = stackNum * stackSize + stackPointer[stackNum] + 1; stackPointer[stackNum]++;
		buffer[index] = value;
	} 
	int pop(int stackNum) {
		int index = stackNum * stackSize + stackPointer[stackNum]; stackPointer[stackNum]--;
		int value = buffer[index];
		buffer[index]=0;
		return value;
	}
	int peek(int stackNum) {
		int index = stackNum * stackSize + stackPointer[stackNum];
		return buffer[index];
	} 
	boolean isEmpty(int stackNum) {
		return stackPointer[stackNum] == stackNum*stackSize;
	}
	public static void main(String[] args) {
		terrible t = new terrible();
		t.push(0, 42);
		// first index is skipped
		System.out.println(t.buffer[0]);
		// 42
		System.out.println(t.pop(0));
		// empty stack gives 0?
		System.out.println(t.pop(0));
		// but it's empty right?
		System.out.println(t.isEmpty(0));
		// guess not
	}
}
