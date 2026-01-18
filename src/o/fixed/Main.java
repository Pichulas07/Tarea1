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


    //Problemas identificados

    /*El metodo caculateTotalArea en el codigo bad, al añadir otras funciones 
    (como por ejemplo una clase triangulo) se debe modificar el codigo  ya realizado
    para añadir una nueva verificacion lo que incumple con el principio ya que este 
    indica que el codigo debe estar abierto a extenciones más no a modificaciones */

    //Justificacion de la refactorizacion

    /*Se elimina la estructura if ya que como todas las figuras
    poseen area, este metodo se crea de manera abstracta en 
    la class Shape (de la cual heredan las demás figuras) para 
    asi poder acceder diretamente sin necesidad de crean un objeto 
    del tipo de la figura por cada figura distinta y asi el for 
    tenga el resultado del area sin importal el tipo de figura. 
    Por otro lado se crean las clases de Shape, Circle, Rectangle, 
    entre otras aparte para tambien respetar el principio de 
    responsabilidad unica y se les cambio de nombre para que 
    coincidieran con el nombre de los constructores */


}
