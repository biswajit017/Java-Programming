public class Shape {

    public static Shape randShape()
    {


        int randomValue  = ((int) (Math.random() * 3)) ;

        switch (randomValue) {
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            default:
                System.out.println("Default case executed");
                return new Shape();
        }
    }

    public void draw()
    {
        System.out.println("Shape Draw.");
    }

    public void erase()
    {
        System.out.println("Shape Erase.");
    }
}