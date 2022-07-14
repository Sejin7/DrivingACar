package model;

public class Ferrari extends Car {
    public final String name = "ferrari";
    public final int numberPlate = 2;
    // overriding
    public void drive() {
        System.out.println("붕-");
    }
    public void stop() {
        System.out.println("끽-");
    }
}
