package view;

import model.Human;

public class PrintSomething {
    public void printGarage(boolean[] garage) {
        System.out.printf("현재 보유 차량: ");
        for(int i=0; i<3; i++) {
            if (garage[i] && i == 0) System.out.printf("model.bentley ");
            else if (garage[i] && i == 1) System.out.printf("model.ferrari ");
            else if (garage[i] && i == 2) System.out.printf("model.genesis ");
        }
        System.out.printf("\n");
    }

    public void printName(String name) {
        System.out.printf("캐릭터 이름: %s\n", name);
    }
    // motion 선택 시 1~5이 아닌 다른 수를 입력한 경우 메세지 출력
    public void printWrongMotionInputMessage() {
        System.out.println("1~5 중 하나의 값을 입력하세요");
    }
    // 1~3 중 하나의 입력을 입력하라는 에러메세지 출력
    public void printWrongIntegerInput1to4() {System.out.println("1~4 중 하나의 값을 입력하세요");}
    // 차량 하차 메세지
    public void printTakeOffFromCar(int currentCar) {
        if(currentCar == 1) System.out.println("bentley 차량에서 하차하였습니다.");
        else if(currentCar == 2) System.out.println("ferrari 차량에서 하차하였습니다.");
        else if(currentCar == 3) System.out.println("genesis 차량에서 하차하였습니다.");
    }
    // 탑승한 챠량이 없을 때 메세지
    public void printTakeCar(){
        System.out.println("탑승한 차량이 없습니다.차고지에 있는 차량에 탑승해주세요");
    }
    // 차량을 운전하지 않은 상태에서 정차하려고 할 때 메세지
    public void printYouShouldRideACar(){
        System.out.println("차량을 운전하고 있지 않습니다.");
    }
    // 차량을 운전하는 상태에서 하차하려고 할 때 메세지
    public void printStopFirst() {
        System.out.println("차량을 운전하는 상태에서 하차할 수 없습니다.");
    }
    // 캐릭터 목록 출력
    public void printUsers(Human[] users) {
        System.out.println("현재 캐릭터 목록: ");
        // 현재 캐릭터 목록 출력
        for(int i=0; i<5; i++){
            if(users[i].isCreated && i == 0) System.out.printf("%d.%s ", i+1, users[i].name);
            else if(users[i].isCreated && i == 1) System.out.printf("%d.%s ", i+1, users[i].name);
            else if(users[i].isCreated && i == 2) System.out.printf("%d.%s ", i+1, users[i].name);
            else if(users[i].isCreated && i == 3) System.out.printf("%d.%s ", i+1, users[i].name);
            else if(users[i].isCreated && i == 4) System.out.printf("%d.%s ", i+1, users[i].name);
        }
        System.out.println("사용할 캐릭터의 번호를 입력하세요 (최대 5개의 캐릭터 생서 가능. 1~5의 자연수)");
    }
    // 캐릭터 변경 메세지 출력
    public void printChangeCharacter(String name) {
        System.out.printf("캐릭터를 변경합니다: 현재 캐릭터는 %s\n", name);
    }
    // 캐릭터 선택 에러메세지
    public void printSelectCharacterError() {
        System.out.println("선택한 캐릭터가 존재하지 않습니다. 다시 입력하세요");
    }
    // 비어있는 캐릭터창이 존재하지 않을 때
    public void printNoEmptyCharacterList() {
        System.out.println("비어있는 캐릭터 창이 없습니다. 새로운 캐릭터를 생성하려면 캐릭터를 삭제하세요");
    }
    // 캐릭터 생성 후 바로 사용하지 않을 경우 메세지
    public void printNoUserCharacter() {
        System.out.println("기존 캐릭터를 그대로 사용합니다.");
    }
    // 선택한 캐릭터가 존재하지 않을 때
    public void printCharacterIsNotCreated() {
        System.out.println("해당 캐릭터는 존재하지 않습니다. 다른 번호를 입력하세요");
    }
    // 선택한 캐릭터를 삭제할 때 메세지
    public void printCharacterIsDeleted(String name) {
        System.out.printf("캐릭터 %s가 삭제됩니다.\n", name);
    }
    // 게임 종료 메세지
    public void printEnd() {
        System.out.println("게임을 종료합니다.");
    }
}
