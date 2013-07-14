public class ex1_4 {
    public static boolean isAnagram(String s1, String s2) {
        if (s1 == null && s2 == null)
            return true;

        int len1 = s1.length(), len2 = s2.length();
        if (len1 != len2)
            return false;
    
        int[] ascii = new int[256];

        for (int i = 0; i < len1; i++) {
            char c = s1.charAt(i);
            int pos = c - 'a';
            ascii[pos]++;
        }

        for (int i = 0; i < len2; i++) {
            char c = s2.charAt(i);
            int pos = c - 'a';
            if (ascii[pos] <= 0)
                return false;
            ascii[pos]--;
        }

        return true;
    }

    public static void main(String[] args) {
        String first = "first";
        String rifst = "rifst";
        print(first, rifst);
        String hello = "hello";
        String world = "world";
        print(hello, world);
        String abc = "abc";
        String abcd = "abcd";
        print(abc, abcd);
        print("", "");
    }

    public static void print(String s1, String s2) {
        System.out.println("Are " + s1 + " and " + s2 + " anagrams? " + isAnagram(s1, s2));
    }
}
