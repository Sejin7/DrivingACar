package controller;

import view.*;
import model.*;

public class HowToUseCar {
    HumanBehave hb = new HumanBehave();
    void purchaseCar(Human user, CharStringDataInput di2, PrintSomething ps) {
        while (true) {
            // 차 구매여부 묻기
            char YesOrNo = di2.inputCarYesOrNo();
            // 차를 구매하지 않거나 구매
            if (YesOrNo == 'N') {
                ps.printGarage(user.garage);
                break;
            } else if (YesOrNo == 'Y') {
                hb.getCar(user);
                break;
            } else di2.wrongInput();
        }

    }

    void takeCar(Human user, CharStringDataInput di2, PrintSomething ps) {
        while (true) {
            // 탑승한 차량이 없을 때
            if (user.currentCar == 0) {
                // 차량에 탑승할 지 여부 묻기
                char YesOrNo = di2.inputRideYesOrNo();

                // 탑승하지 않는 경우
                if (YesOrNo == 'N') break;
                    // 새로운 차량에 탑승
                else if (YesOrNo == 'Y') {
                    hb.ridingACar(user);
                    break;
                }
                // 입력이 잘못되었을 겨우
                else di2.wrongInput();
            } else if (user.currentCar == 1 || user.currentCar == 2 || user.currentCar == 3) {
                // 이미 차량에 탑승하고 있을 때
                // 새로운 차량에 탑승할 지 여부 묻기
                char YesOrNo = di2.inputNewCarYesOrNo();

                // 새로운 차량에 탑승하지 않음 → 내리기 or 그대로
                if (YesOrNo == 'N') {
                    // 차량에서 하차할지 여부 묻기
                    YesOrNo =di2.inputTakeOffYesOrNo();

                    // 현재 차량 그대로 유지
                    if (YesOrNo == 'N') break;
                        // 차량에서 하자하기
                    else if (YesOrNo == 'Y') {
                        hb.takeOffFromCar(user);
                        break;
                    }
                    // 입력이 잘못되었을 겨우
                    else di2.wrongInput();
                }
                // 새로운 차량에 탑승
                else if (YesOrNo == 'Y') {
                    hb.ridingACar(user);
                    break;
                }
                // 입력이 잘못되었을 겨우
                else di2.wrongInput();
            }
        }
    }
}
