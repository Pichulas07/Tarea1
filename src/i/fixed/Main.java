package i.fixed;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.work();
        employee.eat();
        employee.sleep();

        Robot robot = new Robot();

        robot.work();

    }

    //Problemas identificados

    /*La interface WorkerOriginal posee varios metodos para diferentes acciones 
    lo cual incumple con el principio de segregacion de interfaces el cual indica 
    Es mejor tener muchas interfaces específicas del cliente que una interfaz única 
    de propósito general. Los clientes no deben ser forzados a depender de métodos 
    que no usan, situacion la cual pasa con las clases de Employee y Robot ya que
    al depender ambos de la interface estos poseen los mismo metodos sin embargo, 
    Robot no ocupa los metodos de sleep e eat a diferencia de employee  
    */

    //Justificacion de la refactorizacion
    /*Se creo diferentes interfaces para los metodos de  
    eat, sleep y work para que asi que la clases Robot e Employee 
    no dependieran de una sola interface y no tuviera que poseer metodos 
    que no usan asi cumpliendo con el principio de segregacion de interfaces */
}
