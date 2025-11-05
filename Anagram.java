package week3.day1;
// optional package (remove if not using packages)

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        // Step 1: Define two input strings
        String text1 = "stops";
        String text2 = "potss";

        // Step 2: Check if lengths are equal
        if (text1.length() != text2.length()) {
            System.out.println("Lengths mismatch, therefore the strings are not an Anagram.");
            return; // Exit the program
        }

        // Step 3: Convert both strings to character arrays
        char[] array1 = text1.toCharArray();
        char[] array2 = text2.toCharArray();

        // Step 4: Sort both character arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Step 5: Compare the sorted arrays
        if (Arrays.equals(array1, array2)) {
            System.out.println("The given strings are Anagram.");
        } else {
            System.out.println("The given strings are not an Anagram.");
        }
    }
}

