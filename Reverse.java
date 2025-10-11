public class Reverse {
    public static void main(String[] args) {

        // Declare and initialize variables
        float version = 91.0f;
        String developer = "Google";
        boolean isBeta = false;
        int releaseYear = 2008;
        char shortcutKey = 'C';
        String browserName = "Chrome";

        // Print all variable values
        System.out.println("Chrome Browser Details:");
        System.out.println("Browser Name: " + browserName);
        System.out.println("Version: " + version);
        System.out.println("Developer: " + developer);
        System.out.println("Is Beta Version: " + isBeta);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Shortcut Key: " + shortcutKey);

        // Print browser name in reverse order
        String reverseName = new StringBuilder(browserName).reverse().toString();
        System.out.println("Browser Name in Reverse: " + reverseName);
    }
}
