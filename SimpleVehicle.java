class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        if (year <= 0) {
            System.err.println("Error Invalid Input");
            return;
        }
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {

        if (year <= 0) {
            System.err.println("Error Invalid Input");
            return;
        } else {
            System.out.println("Vehichle Make: " + make + "Model: " + model + "Year: " + year);

        }
    }

}

class Car extends Vehicle {

    int noofDoors;

    public Car(String make, String model, int year, int noofDoors) {
        super(make, model, year);
        if (noofDoors <= 0) {
            System.err.println("Error Invalid Input");
            return;
        }
        this.noofDoors = noofDoors;
    }

    public void displayDetails() {

        if (year <= 0 || noofDoors <= 0) {
            return;
        } else {
            System.out.println("Vehichle Make: " + make + "Model: " + model + "Year: " + year);

        }
    }
}

class Bike extends Vehicle {

    String type;

    public Bike(String make, String model, int year, String type) {
        super(make, model, year);
        this.type = type;
    }

    public void displayDetails() {
        if (year <= 0) {
            return;
        }

        else {
            System.out.println("Vehichle Bike:" + make + "Model:" + model + "Year:" + year + "Type: " + type);

        }
    }
}

public class SimpleVehicle {
    public static void main(String[] args) {
        Car car = new Car("Audi", "Q8", 2001, 4);
        car.displayDetails();

        Bike bike = new Bike("Yamaha", "MT-07", 2000, "Sports");
        bike.displayDetails();
    }
}