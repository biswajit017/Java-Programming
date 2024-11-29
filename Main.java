public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add( -10, 20);
        System.out.println("The Sum of Two Integer Values is:" + result);
        
         double result1 = calculator.add(10.5, 20.3);
        System.out.println("The Sum of Two Double Values is:" + result1);
        
        int result2 = calculator.mul(5, 06);
        System.out.println("The Multipication of Two Integer Values is:" + result2);
        
        double result3 = calculator.mul(5.99, 6.85);
        System.out.println("The Multipication of Two Double Values is:" + result3);
        
    }
}

/*
Question 1
 * Write a Java program that defines a MathOperations class with method overloading to perform arithmetic operations. Implement the following methods:

Take a class Calculator(BLC Class)

take 4 public Method :
add(int num1, int num2): Returns the sum of two integers.

add(double num1, double num2): Returns the sum of two doubles.

multiply(int num1, int num2): Returns the product of two integers.

multiply(double num1, double num2): Returns the product of two doubles.

Take an (ELC Class)In the main method, create an instance of MathOperations and demonstrate the use of each method by performing calculations with different types of arguments (integers and doubles).

Test Cases-1 :    Add two doubles
------------------
Sample Input: 10.5, 20.3

Expected Output:

Sum of 10.5 and 20.3 (double): 30.8


Test Cases -2 :
------------------
Multiply two integers

Sample Input: 10, 20

Expected Output:
Product of 10 and 20 (int): 200

Test Case-3 :
----------------
Add with negative integers

Sample Input: -10, 20

Expected Output:

Sum of -10 and 20 (int): 10
 */
