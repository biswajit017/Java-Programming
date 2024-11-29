public class ShapeCalculator
{
  
    public double calculateArea(int sideLength)
    {
        if (sideLength < 0) 
        {
            System.err.println("Error: Side length must be non-negative.");
            return 0;
        }
        return  sideLength *sideLength;                            //Math.sqrt(sideLength);
    }
    public double calculateArea(int length, int width)
    {
        if (length < 0 || width > 0) 
        {
            System.err.println("Error:  length must be non-negative.");
            return 0;
        }
        else if (width < 0 || length >0) 
        {
            System.err.println("Error: width must be non-negative.");
            return 0;
        }
        else if (width < 0 || length <0) 
        {
            System.err.println("Error: Legth & Width must be non-negative.");
            return 0;
        }
        return length * width;
    }
    public double calculateArea(double radius)
    {
        final double pi = 3.14159265359;
        if (radius < 0) 
        {
            System.err.println("Error: radius must be non-negative.");
            return 0;
        }
        return pi * Math.sqrt(radius);
    }
   
}