package model;

public class Bentley extends Car {
    public final String name = "bentley";
    public final int numberPlate = 1;
    // overriding
    public void drive() {
        System.out.println("부르릉");
    }
    public void stop() {
        System.out.println("끼이익");
    }
}
