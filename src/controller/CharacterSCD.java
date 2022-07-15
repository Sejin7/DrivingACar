package controller;

import model.Human;
import view.CharStringDataInput;
import view.IntegerDataInput;
import view.PrintSomething;

import java.util.Scanner;

public class CharacterSCD {
    // 메서드 사용에 필요한 변수 선언
    IntegerDataInput di = new IntegerDataInput();
    CharStringDataInput di2 = new CharStringDataInput();
    PrintSomething ps = new PrintSomething();
    // 캐릭터 선택 메서드
    public Human characterSelect(Human[] users, Human user) {
        while(true) {
            // 선택할 캐릭터 입력받기
            int choice = di.inputCharacterToUse();
            // 캐릭터 선택 및 현재 캐릭터 변경
            if (users[choice].isCreated) {
                ps.printChangeCharacter(users[choice].name);
                return users[choice];
            } else ps.printSelectCharacterError();
        }
    }
    // 캐릭터 생성 메서드
    public Human characterCreate(Human[] users, Human user) {
        // 타 클래스의 메서드를 사용하기 위한 변수 선언
        HumanBehave hb = new HumanBehave();
        // 메서드에 필요한 변수 선언
        boolean isEmptySpace = false;
        int i;
        // 비어있는 캐릭터창 찾기
        for(i=0; i<5; i++) {
            if(!users[i].isCreated){
                isEmptySpace = true;
                break;
            }
        }
        // 비어있는 캐릭터창이 존재할 때
        if(isEmptySpace) {
            Human userNew = new Human();
            // 이름을 입력받고 캐릭터 목록에 저장
            hb.getName(userNew);
            userNew.isCreated = true;
            users[i] = userNew;
            // 해당 캐릭터를 사용할지 여부 확인
            char choice2 = di2.inputUseOrNot();
            // 바로 사용 시
            if(choice2 == 'Y') return users[i];
            else {
                ps.printNoUserCharacter();
                return user;
            }
        }
        // 비어있는 캐릭터창이 존재하지 않을 때
        else {
            ps.printNoEmptyCharacterList();
            return user;
        }
    }
    // 캐릭터 삭제 메서드
    public void characterDelete(Human[] users) {
        // 삭제할 캐릭터의 번호를 입력받음
        int choice = di.inputCharacterDelete();
        // 선택한 창에 캐릭터가 존재하지 않는 경우와 존재하는 경우
        if(!users[choice].isCreated) ps.printCharacterIsNotCreated();
        else {
            ps.printCharacterIsDeleted(users[choice].name);
            users[choice] = null;
        }
    }
}
