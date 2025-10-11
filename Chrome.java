public class Chrome {

    // Declare variables
    float browserVersion;
    String browserName;
    boolean isVisible;
    int releaseYear;
    char browserLogo;

    // Constructor to initialize values
    public Chrome() {
        browserVersion = 100.2f;
        browserName = "chrome";
        isVisible = true;
        releaseYear = 1998;
        browserLogo = 'c';
    }

    // Method to display browser details
    public void displayDetails() {
        System.out.println("Browser Name: " + browserName);
        System.out.println("Browser Version: " + browserVersion);
        System.out.println("Is Visible: " + isVisible);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Browser Logo: " + browserLogo);
    }

    // Main method
    public static void main(String[] args) {
        // Create object and call method
        Chrome fx = new Chrome();
        fx.displayDetails();
    }
}
