package controller;

import model.Human;
import view.IntegerDataInput;
import view.PrintSomething;

public class CharacterAction {
    // 메서드 사용에 필요한 변수 생성
    IntegerDataInput di = new IntegerDataInput();
    CharacterSCD cscd = new CharacterSCD();
    PrintSomething ps = new PrintSomething();
    // 캐릭터 선택/생성/삭제 흐름제어
    public void characterController(Human[] users, Human user) {
        while(true) {
            // 캐릭터 목록 출력
            ps.printUsers(users);
            // 다음 행동 입력받기
            int choice = di.inputCharacterAction();
            // 캐릭터 선택
            if (choice == 1) user = cscd.characterSelect(users, user);
                // 캐릭터 생성
            else if (choice == 2) user = cscd.characterCreate(users, user);
                // 캐릭터 삭제
            else if (choice == 3) cscd.characterDelete(users);
                // 뒤로가기
            else if (choice == 4) break;
            else ps.printWrongIntegerInput1to4();
        }
    }
}
