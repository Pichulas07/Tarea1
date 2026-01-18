package d.fixed;

public class Main {
    public static void main(String[] args) {
        EngineOriginal engine = new EngineOriginal();
        CarOriginal car = new CarOriginal(engine);
        car.start();

        /*
        En este último código, en representación de la letra “D” o Dependency Inversion Principle, se puede apreciar una clase llamada CarOriginal, 
        la cual posee como atributo privado un objeto de tipo EngineOriginal. El problema en este diseño radica en que la clase CarOriginal depende 
        directamente de la clase concreta EngineOriginal, ya que la crea y la conoce de forma directa. Esta dependencia directa es incorrecta, 
        debido a que la clase de alto nivel (CarOriginal) no debería depender de una implementación concreta, sino de una abstracción, lo que 
        permitiría una mayor flexibilidad y facilidad de mantenimiento. Por ejemplo, si se quisiera implementar un ElectricEngineOriginal, sería 
        necesario modificar la clase CarOriginal, lo cual rompe el principio SOLID al generar un fuerte acoplamiento entre las clases. 
        Para solucionar este problema, se crea una interfaz llamada Engine, la cual define el método start(). Posteriormente, la clase 
        EngineOriginal implementa dicha interfaz. De esta manera, la clase CarOriginal depende de la abstracción Engine y no de una 
        implementación concreta, cumpliendo correctamente con el principio de inversión de dependencias.
        */
    }

}
