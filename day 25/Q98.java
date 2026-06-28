// Write a program to Find common characters
// in strings
public class Q98 {
    public static void main(String[] args) {

        String[] str = {"apple", "plane", "plead"};

        // Check each character of the first string
        for (int i = 0; i < str[0].length(); i++) {
            char ch = str[0].charAt(i);

            // Skip duplicate characters in the first string
            boolean duplicate = false;
            for (int k = 0; k < i; k++) {
                if (str[0].charAt(k) == ch) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate)
                continue;

            boolean common = true;

            // Check whether the character is present in all other strings
            for (int j = 1; j < str.length; j++) {
                boolean found = false;

                for (int l = 0; l < str[j].length(); l++) {
                    if (ch == str[j].charAt(l)) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    common = false;
                    break;
                }
            }

            // Print the common character
            if (common) {
                System.out.print(ch + " ");
            }
        }
    }
}
