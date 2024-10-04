package org.example.BridegPattern;

public class Toyota extends Car{
    public Toyota(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.print("Toyota is driving. ");
        engine.start();
    }
}
