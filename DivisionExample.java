import java.util.Scanner;

public class DivisionExample {

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Dividend  : ");
        int x = sc.nextInt();

        System.out.println("Enter Divisor :");
        int y = sc.nextInt();

        DiExample(x, y);
        sc.close();
        
    }

    public static int DiExample(int dividend ,int divisor)
    {
        int result ;

        try
        {
            result = dividend / divisor ;
            System.out.println("Result of Divison : " + result);
            return result;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Ariethmatic Exception Caught. : Division by Zero." + " Dividend is : " + dividend + " Divisor is : " + divisor);
            return 0;
        }
        
        
    }
}