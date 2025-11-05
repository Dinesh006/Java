package week3.day1; // optional package (you can remove this line if not using packages)

public class ReverseOddWords {

    public static void main(String[] args) {

        // Step 1: Input string
        String test = "I am a software tester";

        // Step 2: Split the words and store in an array
        String[] words = test.split(" ");

        // Step 3: Traverse through each word
        for (int i = 0; i < words.length; i++) {

            // Step 4: Check for odd index positions (index starting from 0)
            if (i % 2 != 0) {
                // Convert the word into a character array
                char[] chars = words[i].toCharArray();

                // Print the reversed word
                for (int j = chars.length - 1; j >= 0; j--) {
                    System.out.print(chars[j]);
                }
                System.out.print(" "); // add space after the word
            } else {
                // Print the word as it is (even index)
                System.out.print(words[i] + " ");
            }
        }
    }
}
