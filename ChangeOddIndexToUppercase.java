package week3.day1;
// optional package (you can remove if not using packages)

public class ChangeOddIndexToUppercase {

    public static void main(String[] args) {

        // Step 1: Input string
        String test = "changeme";

        // Step 2: Convert the string into a character array
        char[] chars = test.toCharArray();

        // Step 3: Loop through each character from start to end
        for (int i = 0; i < chars.length; i++) {

            // Step 4: Check if the index is odd
            if (i % 2 != 0) {
                // Step 5: Convert the character to uppercase
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }

        // Step 6: Print the modified string
        System.out.print("Output: ");
        for (char ch : chars) {
            System.out.print(ch);
        }
    }
}

