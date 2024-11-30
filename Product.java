package naresh_it_Exam.Ecommerce_System;

public class Product 
{
	String name;
	double price;
	
	public Product(String name, double price)
	{
		this.name = name;
		this.price= price;
	
	}
	
	public void displayDetails()
	{
		System.out.println("Product Name : " + name + " , " + "Price is : " + "$"+ price);
	}

}
