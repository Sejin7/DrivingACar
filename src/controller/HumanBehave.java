package controller;

import model.*;
import view.*;

public class HumanBehave {
    // 메서드 사용에 필요한 선언
    IntegerDataInput di = new IntegerDataInput();
    CharStringDataInput di2 = new CharStringDataInput();
    SelectCar sc = new SelectCar();
    PrintSomething ps = new PrintSomething();
    // 이름 입력받기
    public void getName(Human user) {
        // 이름을 입력받고 메서드 변수 name에 전달
        user.name = di2.inputName();
        // 캐릭터 생성여부 false에서 true로 변경
        user.isCreated = true;
        // 이름 출력
        ps.printName(user.name);
    }

    // 차 구매) carNum → 1: model.bentley, 2: model.ferrari, 3: model.genesis
    public void getCar(Human user) {
        int carNum = 0;
        // 입력받기
        carNum = di.inputCarNum1();
        // 입력받은 차를 차고에 추가
        sc.getCar(carNum, user.name, user.garage);
        // 차고 상태 출력
    }

    // 차 판매) carNum → 1: model.bentley, 2: model.ferrari, 3: model.genesis
    public void sellCar(Human user) {
        int carNum = 0;
        // 입력받기
        carNum = di.inputCarNum2();
        // 입력받은 차를 판매해 garage에서 제거
        sc.sellCar(carNum, user.name, user.garage);
    }
    // 차량 탑승
    public void ridingACar(Human user) {
        ps.printGarage(user.garage);
        int carNum = 0;
        // 입력받기
        carNum = di.inputCarNum3();
        // 선택한 차량에 탑승
        sc.ridingCar(carNum, user.name, user.garage);
        // 선택한 차량을 탑승
        user.currentCar = carNum;
    }
    // 차량에서 하차
    public void takeOffFromCar(Human user) {
        ps.printTakeOffFromCar(user.currentCar);
        user.currentCar = 0;
    }
}
