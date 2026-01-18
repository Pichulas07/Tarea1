package o.fixed;

public class Main {
    public static void main(String[] args) {

        //Metodo main

        Shape[] shapes = {new Triangle(50, 20),
            new Rectangle(20, 40),
            new Circle(30)};

            ShapeCalculatorOriginal calculator = new ShapeCalculatorOriginal();

            System.out.println("The total of areas is: " + calculator.calculateTotalArea(shapes) );
            

    }
}
