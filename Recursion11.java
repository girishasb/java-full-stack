public class Recursion11 {

    static boolean[] map = new boolean[26]; // Tracks if a character has appeared

    public void removeDuplicates(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            // Already seen, skip it
            removeDuplicates(str, idx + 1, newString);
        } else {
            // Not seen, add to newString
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abbccda";
        Recursion11 obj = new Recursion11(); // Create object of the correct class
        obj.removeDuplicates(str, 0, "");
    }
}
