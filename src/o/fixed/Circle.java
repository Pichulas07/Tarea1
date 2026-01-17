package o.fixed;

public class Circle extends Shape { //Fallo en el nombre de la clase y del constructor (CircleOriginal/Circle)
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double Area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
