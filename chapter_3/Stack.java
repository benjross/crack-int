public class Stack {
	int[] arr;
	int top;

	public Stack() {
		arr = new int[16];
		top = -1;
	}
	
	public Integer pop() {
		if (top < 0)
			return null;
		return arr[top--];
	}

	public void push(int num) {
		top++;
		if (top == arr.length) {
			int[] temp = new int[arr.length * 2];
			for (int i = 0; i < arr.length; i++) {
				temp[i] = arr[i];
			}
			arr = temp;
		} 
		arr[top] = num;
	}		
}
