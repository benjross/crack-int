public class Queue {
	int front, back, items;
	int[] arr;

	public Queue() {
		arr = new int[16];
		front = 0;
		back = front;
		items = 0;
	}

	public void push(int i) {
		if (items == 0) {
			front = 0;
			arr[front] = i;
			back = front;
		} else {
			back++;
			if (back == arr.length) {
				int[] temp = new int[arr.length * 2];
				int j = 0;
				for (int num : arr) {
					temp[j] = num;
					j++;
				}
				front = 0;
				back = j;
				arr = temp;
			}
			arr[back] = i;
		}
		items++;
	}

	public Integer pop() {
		if (items == 0)
			return null;
		items--;
		return arr[front++];
	}
}
