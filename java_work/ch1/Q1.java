public class Q1 {
    public static boolean isUnique(String str) {
        boolean result = false;
        boolean[] chars = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int ch = (int) str.charAt(i);
            //System.out.println(ch);
            if (chars[ch]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};

        for (String word : words) {
            System.out.println(word + ": " + isUnique(word));
        }
    }
}
