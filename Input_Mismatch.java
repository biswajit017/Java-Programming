import java.util.Scanner;

public class Input_Mismatch
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        

        try{

            System.out.println("Enter the first integer (a) : ");

            int a = sc.nextInt();

            System.out.println("Enter the second integer (b) : ");

            int b = sc.nextInt();

            System.out.println("You entered a = " + a + " & b = " + b );

        }
        catch(Exception e)
        {
           System.out.println(e);
           e.getMessage();
           e.printStackTrace();
           e.toString();
        }
    }
}