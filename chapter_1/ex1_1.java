import java.util.HashSet;

public class ex1_1 {

	public static boolean allUnique(String s) {
		if (s == null)
			return true;
		HashSet<Character> set = new HashSet<Character>();
		for (char c : s.toCharArray()) {
			if (set.contains(c))
				return false;
			set.add(c);
		}
		return true;
	}

	public static boolean allUniqueNoData(String s) {
		if (s == null)
			return true;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j))
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String one = "hello, world";
		System.out.println(one + ": " + allUnique(one));
		String two = "ben!=girl";
		System.out.println(two + ": " + allUnique(two));
		System.out.println("empty string: " + allUnique(""));
		System.out.println("null: " + allUnique(null));
		System.out.println("-------------------------");
		System.out.println(one + ": " + allUniqueNoData(one));
		System.out.println(two + ": " + allUniqueNoData(two));
		System.out.println("empty string: " + allUnique(""));
		System.out.println("null: " + allUnique(null));
	}
}
