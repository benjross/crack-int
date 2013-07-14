public class ex1_5 {

    public static String replaceSpaces(String s) {
        if (s == null)
            return "";
        
        int len = s.length();
        int numSpaces = 0;
        char[] sArray = s.toCharArray();

        for (char c: sArray) {
            if (c == ' ')
                numSpaces++;
        }

        char[] newSArray = new char[len + 2*numSpaces];
        int pos = 0;
        for (char c: sArray) {
            if (c == ' ') {
                newSArray[pos++] = '%';
                newSArray[pos++] = '2';
                newSArray[pos++] = '0';
            } else {
                newSArray[pos++] = c;
            }
        }

        return new String(newSArray);
    }


    public static void main(String[] args) {
        print("Hello, world!");
        print(" a b c d ");
        print("");
        print(null);
    }

    public static void print(String s) {
        String tmp = (s == null? "null" : s);
        System.out.println(tmp + " with spaces removed is " + replaceSpaces(s));
    }
}
