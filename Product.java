package naresh_it_Exam.Chaning_Owner;

public class Product {
    private String brand;
    private String model;
    private int year;
    private Owner owner;

    public Product(String brand, String model, int year, Owner owner) {
        if (year <= 0) {
            System.out.println("Error Invalid Input");
            System.exit(0);
        }
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.owner = owner;
    }

    public Product(Product product) {
        this.brand = product.brand;
        this.model = product.model;
        this.year = product.year;
        this.owner = new Owner(product.owner.getName(), product.owner.getAge());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0) {
            System.out.println("Error Invalid Input");
            System.exit(0);
        }
        this.year = year;
    }

    public Owner getDriver() {
        return owner;
    }

    public void setDriver(Owner owner) {
        this.owner = owner;
    }

    public void changeDriver(Owner newDriver) {
        this.owner = newDriver;
    }

    public void printDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Driver Name: " + owner.getName());
        System.out.println("Driver Age: " + owner.getAge());
    }
}


































