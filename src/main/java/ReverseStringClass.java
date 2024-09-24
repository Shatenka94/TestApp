public class ReverseStringClass {
    public static String reverseString (String s) {
        if (s == null) {
            return null;
        }
        String reversed = null;
        for (int i = s.length(); i >= 0; i--) {
            reversed = "";
            reversed += s.charAt(i);

        }
        return reversed;
    }

}
