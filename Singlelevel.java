package week3.day1;

//Superclass
public class Singlelevel {

 // Method 1
 public void enterCredentials() {
     System.out.println("Entering user credentials...");
 }

 // Method 2
 public void navigateToHomePage() {
     System.out.println("Navigating to Home Page...");
 }

 public static void main(String[] args) {

     // Create object for superclass
     Singlelevel test = new Singlelevel();
     System.out.println("----- Superclass Methods -----");
     test.enterCredentials();
     test.navigateToHomePage();

     // Create object for subclass
     LoginTestData login = new LoginTestData();
     System.out.println("\n----- Subclass Methods -----");
     login.enterUsername();
     login.enterPassword();

     // Access inherited methods from superclass
     System.out.println("\n----- Inherited Methods from Superclass -----");
     login.enterCredentials();
     login.navigateToHomePage();
 }
}

//Subclass
class LoginTestData extends Singlelevel {

 // Method 1
 public void enterUsername() {
     System.out.println("Username entered successfully.");
 }

 // Method 2
 public void enterPassword() {
     System.out.println("Password entered successfully.");
 }
}
