package controller;

import model.Human;
import view.CharStringDataInput;
import view.IntegerDataInput;
import view.PrintSomething;

public class Controller {
    // 캐릭터 저장: 최대 5개 생성 가능
    public Human[] users = new Human[5];
    public void game() {
        // 메서드 호출을 위해 사용되는 변수들 선언
        HumanBehave hb = new HumanBehave();
        IntegerDataInput di = new IntegerDataInput();
        CharStringDataInput di2 = new CharStringDataInput();
        PrintSomething ps = new PrintSomething();
        HowToUseCar uc = new HowToUseCar();
        CanRideACar cr = new CanRideACar();
        CharacterAction ca = new CharacterAction();

        // Human 배열 초기화
        Human user = new Human();
        for(int i=0; i<5; i++) users[i] = user;
        // 캐릭터 이름 설정
        hb.getName(user);
        users[0] = user;

        while(true) {
            // 다음 행동 결정
            int motion = di.inputWhatToDo();
            // 차 구매
            if(motion == 1) uc.purchaseCar(user, di2, ps);
            // 차 탑승 및 하차
            else if(motion == 2) uc.takeCar(user, di2, ps);
            // 탑승한 차량 운전
            else if(motion == 3) cr.doYouHaveACar(user);
            // 캐릭터 선택/생성/삭제
            else if(motion == 4) ca.characterController(users, user);
            // 게임 종료
            else if(motion == 5) {
                // 종료메세지 출력 및 종료
                ps.printEnd();
                break;
            }
            // 잘못된 입력
            else ps.printWrongMotionInputMessage();
        }
    }
}
