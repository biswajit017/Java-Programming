package naresh_it_Exam.Chaning_Owner;

public class Main 
{
	public static void main(String[] args)
	{

		 Owner owner1 = new Owner("John", 30);
         Product car1 = new Product("Hyundai", "Creta", 2020, owner1);
 
         Product productCopy = new Product(car1);
 
         System.out.println("Original Car Details:");
         car1.printDetails();
         System.out.println();
         System.out.println("Copied Car Details:");
         productCopy.printDetails();
 
         Owner driver2 = new Owner("Logan", 35);
         car1.changeDriver(driver2);
 
         System.out.println();
         System.out.println("Original Car Details after Changing Driver:");
         car1.printDetails();
         System.out.println();
         
		
		
		
		
	}

}
