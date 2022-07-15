package model;

import view.*;

public class Human {
    public String name;
    public boolean isCreated;
    public boolean[] garage = new boolean[3];
    public int currentCar;
    IntegerDataInput di = new IntegerDataInput();
    CharStringDataInput di2 = new CharStringDataInput();
    SelectCar sc = new SelectCar();
    PrintSomething ps = new PrintSomething();

}
