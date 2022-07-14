package controller;

import model.*;
import view.*;

public class CanRideACar {
    public void doYouHaveACar(Human user) {
        // view 메서드 이용을 위한 선언
        PrintSomething ps = new PrintSomething();
        IntegerDataInput di = new IntegerDataInput();
        DriveControl dc = new DriveControl();

        if (user.currentCar == 0) ps.printTakeCar();
        else if (user.currentCar == 1 || user.currentCar == 2 || user.currentCar == 3) {
            dc.whatToDoWithYourCar(user);
        }
    }
}
