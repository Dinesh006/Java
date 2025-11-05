package week3.day1;
 // optional package (you can remove if not using packages)

//-------------------------
//Base Class
//-------------------------
class WebElement {

 public void click() {
     System.out.println("WebElement clicked");
 }

 public void setText(String text) {
     System.out.println("Text set to: " + text);
 }
}

//-------------------------
//Single Inheritance Example
//Button and TextField inherit from WebElement
//-------------------------
class Button extends WebElement {

 public void submit() {
     System.out.println("Button submitted successfully");
 }
}

class TextField extends WebElement {

 public void getText() {
     System.out.println("TextField value retrieved successfully");
 }
}

//-------------------------
//Multilevel Inheritance Example
//CheckBoxButton inherits from Button → WebElement
//-------------------------
class CheckBoxButton extends Button {

 public void clickCheckButton() {
     System.out.println("CheckBox button clicked");
 }
}

//-------------------------
//Hybrid Inheritance Example
//RadioButton inherits from Button (Button already inherits WebElement)
//-------------------------
class RadioButton extends Button {

 public void selectRadioButton() {
     System.out.println("Radio button selected");
 }
}

//-------------------------
//Execution Class
//-------------------------
public class Inheritance {

 public static void main(String[] args) {

     System.out.println("----- WebElement Methods -----");
     WebElement element = new WebElement();
     element.click();
     element.setText("Hello WebElement");

     System.out.println("\n----- Button Methods -----");
     Button button = new Button();
     button.click(); // inherited from WebElement
     button.submit();

     System.out.println("\n----- TextField Methods -----");
     TextField textField = new TextField();
     textField.setText("Sample Input");
     textField.getText();

     System.out.println("\n----- CheckBoxButton Methods -----");
     CheckBoxButton checkBox = new CheckBoxButton();
     checkBox.click(); // from WebElement
     checkBox.submit(); // from Button
     checkBox.clickCheckButton(); // its own method

     System.out.println("\n----- RadioButton Methods -----");
     RadioButton radioButton = new RadioButton();
     radioButton.click(); // from WebElement
     radioButton.submit(); // from Button
     radioButton.selectRadioButton(); // its own method
 }
}
