package o.fixed;

import java.util.List; //No se impotaba la clase list

public class ShapeCalculatorOriginal {
    public double calculateTotalArea(List<Shape> shapes) {

        /*Se elimina la estructura if ya que como todas las figuras
        poseen area, este metodo se crea de manera abstracta en 
        la class Shape (de la cual heredan las demás figuras) para 
        asi poder acceder diretamente sin necesidad de crean un objeto 
        del tipo de la figura por cada figura distinta y asi el for 
        tenga el resultado del area sin importal el tipo de figura */

        double totalArea = 0;
        for (Shape shape : shapes) { 
            totalArea += shape.Area();
            // Add more conditions for other shapes (e.g., Triangle)
        }
        return totalArea;
    }
}

//Creamos las clases de Shape, Circle, Rectangle, entre otras aparte para tambien respetar el principio de responsabilidad unica
