// package Car_Has_A_Engine;
class Engine 

{
   private String model ;  

   public Engine (String model)
   {
    if (model == null || model.trim().isEmpty() || model == "0") {
        System.out.println("Error Invalid Input");
    }
        this.model = model;
   }

public String getModel() {
    return model;
}

public void setModel(String model) {
    this.model = model;
}

@Override
public String toString() {
    return "Engine [model=" + model + "]";
}

   
}


 class Car 
{
    private String make ;
    private String model ;
    private Engine engine;
    
    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + ", engine=" + engine + "]";
    }
}



public class Car_Engine_test
{
    public static void main(String[] args) {
        Engine e1  = new Engine("0");
  
        Car c2 = new Car("Hyundai", "Camry", e1);
   
      System.out.println(c2);

   }
    
}

