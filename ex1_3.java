import java.lang.StringBuilder;

public class ex1_3 {

	public static String removeDup(String s) {
		if (s == null || s.length() == 0)
			return "";
		String ns = "" + s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			for (int j = 0; j < ns.length(); j++) {
				if (s.charAt(i) == ns.charAt(j))
					continue;
				ns += s.charAt(i);
			}
		}
		return ns;
	}

	public static void main(String[] args) {
		System.out.println("Hello, world " + removeDup("Hello, world"));
	}
}
