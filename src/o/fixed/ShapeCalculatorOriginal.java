package o.fixed;
public class ShapeCalculatorOriginal {
    public double calculateTotalArea(Shape[] shapes) {

        

        double totalArea = 0;
        for (Shape shape : shapes) { 
            totalArea += shape.Area();
            // Add more conditions for other shapes (e.g., Triangle)
        }
        return totalArea;
    }
}


