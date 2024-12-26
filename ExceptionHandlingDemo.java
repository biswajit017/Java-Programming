import java.util.Scanner;

public class ExceptionHandlingDemo {

   public static void handleExceptions(String input) {
       if (input != null) {
           // Print the length of the input string
           System.out.println("Length of the input string: " + input.length());

           try {
               // Attempt to convert the string to an integer
               int convertedNumber = Integer.parseInt(input);
               System.out.println("Converted number: " + convertedNumber);
           } catch (NumberFormatException e) {
               System.out.println("NumberFormatException: Invalid input, not a number.");
               System.out.println(e); // Print the stack trace for debugging
           }

           // Deliberately cause a NullPointerException if the string is null (for demonstration)
           try {
               if (input.equals("null")) { // Check for "null" string instead of directly calling a method
                   System.out.println(input.toUpperCase()); // This will throw NullPointerException
               }
           } catch (NullPointerException e) {
               System.out.println("NullPointerException: Attempted to operate on a null object.");
               System.out.println(e); // Print the stack trace for debugging
           }
       } else {
           System.out.println("Input is null.");
       }
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter a string to convert to an integer: ");
       String input = scanner.nextLine();

       handleExceptions(input);

       scanner.close();
   }
}