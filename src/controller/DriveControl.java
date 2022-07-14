package controller;

import model.Bentley;
import model.Ferrari;
import model.Genesis;
import model.Human;
import view.IntegerDataInput;
import view.PrintSomething;

public class DriveControl {
    public void whatToDoWithYourCar(Human user) {
        // 현재 운전하고 있는 상태인지 여부
        boolean drivingNow = false;
        // view 메서드 이용을 위한 선언
        PrintSomething ps = new PrintSomething();
        IntegerDataInput di = new IntegerDataInput();
        while(true) {
            // 차량 탑승 후 행동을 입력받아 motion에 저장
            int motion = di.inputCarWhatToDo();
            // 차량 운전
            if (motion == 1) {
                if (user.currentCar == 1) {
                    Bentley bt = new Bentley();
                    bt.drive();
                    drivingNow = true;
                } else if (user.currentCar == 2) {
                    Ferrari fr = new Ferrari();
                    fr.drive();
                    drivingNow = true;
                } else if (user.currentCar == 3) {
                    Genesis gs = new Genesis();
                    gs.drive();
                    drivingNow = true;
                }
            }
            // 차량 정차
            else if (motion == 2) {
                if (drivingNow) {
                    if (user.currentCar == 1) {
                        Bentley bt = new Bentley();
                        bt.stop();
                        drivingNow = false;
                    } else if (user.currentCar == 2) {
                        Ferrari fr = new Ferrari();
                        fr.stop();
                        drivingNow = false;
                    } else if (user.currentCar == 3) {
                        Genesis gs = new Genesis();
                        gs.stop();
                        drivingNow = false;
                    }
                } else ps.printYouShouldRideACar();
            }
            // 차량 하차
            else if (motion == 3) {
                if (!drivingNow) {
                    ps.printTakeOffFromCar(user.currentCar);
                    user.currentCar = 0;
                    break;
                }
                else ps.printStopFirst();
            }
        }
    }
}
