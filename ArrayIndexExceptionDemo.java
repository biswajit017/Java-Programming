


import java.util.Scanner;  

public class ArrayIndexExceptionDemo {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        int a[] = new int[2];  

        System.out.println("Enter 2 Array Elements:");  

        for (int i = 0; i < a.length; i++) {  
            System.out.print("Element " + (i + 1) + ": ");  

            a[i] = sc.nextInt();  
        }  

        try {  
            System.out.println("Choose Index between 0 to " + a.length + " :");
            int index = sc.nextInt();
            System.out.println(a[index]); 
        } catch (ArrayIndexOutOfBoundsException e) {  
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());  
            System.out.println("Please ensure you're accessing a valid index (0 to " + (a.length - 1) + ").");  
        }  

        sc.close();  
    }  
}