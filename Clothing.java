package naresh_it_Exam.Ecommerce_System;

public class Clothing 
{
	
	String size;

	public Clothing(String size) {
		super();
		this.size = size;
	}
	
	public void showSize()
	{
		System.out.println("The Size of this clothing item is : " + size);
	}

}
