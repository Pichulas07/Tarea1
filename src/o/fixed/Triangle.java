package o.fixed;

public class Triangle extends Shape {
    
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.height = height;
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double Area() {
        return (base * height)/2;
    }

}
