package d.fixed;

public class CarOriginal {
    private Engine engine;

    public CarOriginal(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

}
