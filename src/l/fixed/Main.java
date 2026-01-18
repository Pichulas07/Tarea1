package l.fixed;

public class Main {
    public static void main(String[] args) {
        AreaCaculation rectangle = new Rectangle(10, 5);
        AreaCaculation square = new Square(5);

        System.out.println(rectangle.calculateArea());
        System.out.println(square.calculateArea());
    }
}

/*
En este código, en representación de la letra “L” o Liskov, se puede observar que el error es que la clase square esta heredando de 
rectangle y eso afecta su comportamiento de rectangle, porque un cuadrado no es un rectangulo que se pueda modificar, 
hacer esa herencia rompe liskov ya que square no puede remplazar a rectangle sin alterar el resultado del programa. 
La solución pensada fue hacer un interfaz que ambos puedan implementar para calcular su area, sin afectar sus compotamientos.
 */
