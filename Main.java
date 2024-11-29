public class Main 
{
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        double area_OF_square = calculator.calculateArea(6);
        System.out.println("Area OF Sqaure is : " + area_OF_square);
        double area_OF_rectangle = calculator.calculateArea(6,8);
        System.out.println("Area OF Rectangle is : " + area_OF_rectangle);
        double area_OF_circle = calculator.calculateArea(6);
        System.out.println("Area OF Circle is : " + area_OF_circle);
        }
    
}

/*
 * Write a Java program that defines a ShapeCalculator class with method overloading to calculate the area of geometric shapes. Implement the following methods:


ShapeCalculator - Method overloading


take 4 public Method :

calculateArea(int sideLength): Returns the area of a square (side * side).

calculateArea(int length, int width): Returns the area of a rectangle (length * width).

calculateArea(double radius): Returns the area of a circle (p * radius^2).

Take an Elc class Main  it having main method and execute the methods.

Test Cases -1 :
-------------------
Valid Case: Calculate area of a circle

Sample Input: radius = 7.0

Expected Output:

Area of circle with radius 7.0: 153.93804


Test Cases -2 :
-------------------

Invalid Case: Negative side length for square

Sample Input: sideLength = -5
Expected Output:

Error: Side length must be non-negative.


Test Cases -3 :
-------------------
Invalid Case: Negative length or width for rectangle

Sample Input: length = -5, width = 10

Expected Output:

Error: Length and width must be non-negative.
 */