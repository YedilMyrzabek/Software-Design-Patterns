package org.example.BridegPattern;

public class Tesla extends Car{
    public Tesla(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.print("Tesla is driving. ");
        engine.start();
    }
}
