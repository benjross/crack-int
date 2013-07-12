public class ex1_3 {

	public static String removeDup(String s) {
		if (s == null || s.length() == 0)
			return "";
		String ns = "";
		for (int i = 0; i < s.length(); i++) {
            int j = 0;
			for (j = 0; j < ns.length(); j++) {
				if (s.charAt(i) == ns.charAt(j))
					break;
			}
            if (j == ns.length()) 
                ns += s.charAt(i);
		}
		return ns;
	}

	public static void main(String[] args) {
        System.out.println("abcd = " + removeDup("abcd"));
		System.out.println("Hello, world = " + removeDup("Hello, world"));
		System.out.println("null = " + removeDup(null));
		System.out.println("empty string = " + removeDup(""));
		System.out.println("aaaaa = " + removeDup("aaaaa"));
	}
}
