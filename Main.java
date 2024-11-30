package naresh_it_Exam.Ecommerce_System;

public class Main {
	
    public static void main(String[] args)
    {
    	Product p1 = new Product("SmartPhone",699.99);
    	p1.displayDetails();
    	Electronics e1 = new Electronics("Samsung");
    	e1.showBrand();
    	Product p2 = new Product("T-Shirt",29.99);
    	p2.displayDetails();
    	Clothing c1 = new Clothing("Medium");
    	c1.showSize();
    }

}
