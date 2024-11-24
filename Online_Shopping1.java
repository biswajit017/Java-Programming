package Online_Shopping;

public class Online_Shopping1 {
    public static void main(String[] args) {
        Electronics laptop = new Electronics("Laptop", 55000, "Asus");
       // Clothing tshirt = new Clothing("V-Neck", 499, "L");

        System.out.println("Product Information for Electronics:");
        laptop.displayInfo();
        System.out.println();

        // System.out.println("Product Information for Clothing:");
        // tshirt.displayInfo();
        // System.out.println();

        // System.out.println("Total cost of 2 laptops: " + laptop.calculateTotalCost(2));
        // System.out.println("Total cost of 3 T-shirts: " + tshirt.calculateTotalCost(3));
    }
}
