package i.fixed;

public class Employee implements Worker, Slepper, Eater {

    @Override
    public void eat() {
        System.out.println("The employee is eating");
    }

    @Override
    public void sleep() {
        System.out.println("The employee is sleeping ");
    }

    @Override
    public void work() {
        System.out.println("The employee is working");
    }

    
}
