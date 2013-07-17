public class ex3_1 {
	int[] arr;
	int bot1, top1, bot2, top2, bot3, top3;

	public ex3_1() {
		arr = new int[30];
		bot1 = top1 = 0;
		bot2 = top2 = arr.length / 3;
		bot3 = top3 = 2 * (arr.length / 3);
	}
	
	public void push(int arrayNum, int value) throws Exception {
		if (arrayNum == 1) {
			if (top1 == arr.length / 3)
				throw new Exception();
			arr[top1++] = value;
		} else if (arrayNum == 2) {
			if (top2 == 2 * (arr.length / 3))
				throw new Exception();
			arr[top2++] = value;
		} else {
			if (top3 == arr.length)
				throw new Exception();
			arr[top3++] = value;
		}	
	}

	public int pop(int arrayNum) throws Exception {
		
		if (arrayNum == 1) {
			if (top1 < bot1)
				throw new Exception();
			return arr[--top1];
		} else if (arrayNum == 2) {
			if (top2 < bot2)
				throw new Exception();
			return arr[--top2];
		} else {
			if (top3 < bot3)
				throw new Exception();
			return arr[--top3];
		}	
	}
		

	public static void main(String[] args) throws Exception {
		ex3_1 e = new ex3_1();
		e.push(1, 0);
		System.out.println("Should be 0: " + e.pop(1)); 
		e.push(2, 0);
		System.out.println("Should be 0: " + e.pop(2)); 
		e.push(3, 0);
		System.out.println("Should be 0: " + e.pop(3)); 
		for (int i = 0; i < 10; i++) {
			e.push(1, i);
			e.push(2, i + 10);
			e.push(3, i + 20);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(e.pop(3));
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(e.pop(2));
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(e.pop(1));
		}
	}
}
