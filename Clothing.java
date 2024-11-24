
package Online_Shopping;

public class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Size: " + size);
    }
}
