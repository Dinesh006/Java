package week3.day1;
// optional package (you can remove if not using packages)

public class RemoveDuplicateWords {

    public static void main(String[] args) {

        // Step 1: Input String
        String text = "We learn Java basics as part of java sessions in java week1";

        // Step 2: Split the String into words
        String[] words = text.split(" ");

        // Step 3: Initialize a count variable to track duplicates
        int count = 0;

        // Step 4: Nested loops to find and remove duplicates
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {

                // Compare words ignoring case
                if (words[i].equalsIgnoreCase(words[j])) {
                    words[j] = "";  // Replace duplicate with empty string
                    count++;
                }
            }
        }

        // Step 5: Print result
        if (count > 0) {
            System.out.println("Modified string after removing duplicates:");
            for (int i = 0; i < words.length; i++) {
                if (!words[i].equals("")) {
                    System.out.print(words[i] + " ");
                }
            }
        } else {
            System.out.println("No duplicate words found.");
        }
    }
}
