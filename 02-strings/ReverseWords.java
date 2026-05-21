class ReverseWords {

    public static String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");

        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {

            result += words[i];

            if (i != 0) {
                result += " ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "I love Java";

        System.out.println(reverseWords(s));
    }
}
