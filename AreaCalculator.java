import java.util.Scanner;

public class AreaCalculator 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length : ");
        int x = sc.nextInt();
        System.out.println("Enter the width : ");
        int y = sc.nextInt();
        

        try (sc)
        {
           
            double result = calculateArea(x, y);

            System.out.println("The Area Of Rectangle is : " + result);
        }

        catch(IllegalArgumentException e)
        {
            System.out.println("Make Sure Argument of Length and Width is Positive Value.");
            e.printStackTrace();
        }
        
    }
    public static double calculateArea(double length , double width)
    {
        if (length < 0 || width < 0) 
        {
            throw new IllegalArgumentException("Error");
            
        }
        return  length * width;
    }
    
}
