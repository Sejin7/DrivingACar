package view;

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
    // motion 선택 시 1~6이 아닌 다른 수를 입력한 경우 메세지 출력
    public void printWrongMotionInputMessage() {
        System.out.println("1~6 중 하나의 값을 입력하세요");
    }
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
    // 게임 종료 메세지
    public void printEnd() {
        System.out.println("게임을 종료합니다.");
    }
}
