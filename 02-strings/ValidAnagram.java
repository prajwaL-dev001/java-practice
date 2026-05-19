import java.util.Arrays;

class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {

        String s = "listen";
        String t = "silent";

        System.out.println(isAnagram(s, t));
    }
}