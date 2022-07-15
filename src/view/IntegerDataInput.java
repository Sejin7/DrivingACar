package view;

import java.util.Scanner;

public class IntegerDataInput {
    // 다음 행동을 입력받는 메서드
    public int inputWhatToDo() {
        int motion;
        // 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("무엇을 하시겠습니까?");
        System.out.println("1. 차 구매 2. 차량 탑승 및 하차 3. 탑승한 차량 운전 4. 캐릭터 선택/생성/삭제 5. 게임 종료");
        motion = Integer.parseInt(sc.next());
        return motion;
    }
    // 구매할 차의 번호를 입력받는 메서드
    public int inputCarNum1() {
        int carNum = 0;
        // 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("구매할 차의 번호를 입력하세요: 1. bentley 2. ferrari 3. genesis");
        carNum = Integer.parseInt(sc.next());
        return carNum;
    }
    // 판매할 차의 번호를 입력받는 메서드
    public int inputCarNum2() {
        int carNum = 0;
        // 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("판매할 차의 번호를 입력하세요: 1. model.bentley 2. model.ferrari 3. model.genesis");
        carNum = Integer.parseInt(sc.next());
        return carNum;
    }
    // 탑승할 차의 번호를 입력받는 메서드
    public int inputCarNum3() {
        int carNum = 0;
        // 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("탑승할 차의 번호를 입력하세요: 1. model.bentley, 2. model.ferrari, 3.model.genesis");
        carNum = Integer.parseInt(sc.next());
        return carNum;
    }
    // 차량 탑승 후 행동 입력받는 메서드
    public int inputCarWhatToDo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("무엇을 할지 숫자를 입력해주세요: 1. 운전, 2. 정지 3. 내리기");
        int choice = Integer.parseInt(sc.next());
        return choice;
    }
    // 캐릭터 선택/생성/삭제 여부 입력받는 메서드
    public int inputCharacterAction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("무엇을 할지 숫자를 입력해주세요: 1. 캐릭터 선택 2. 캐릭터 생성 3. 캐릭터 삭제 4. 뒤로가기");
        int choice = Integer.parseInt(sc.next());
        return choice;
    }
    // 사용할 캐릭터의 번호를 입력받는 메서드
    public int inputCharacterToUse() {
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.next());
        return choice;
    }
    // 삭제할 캐릭터의 번호를 입력받느 메서드
    public int inputCharacterDelete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 캐릭터의 번호를 입력하세요(1~5)");
        int choice = Integer.parseInt(sc.next());
        return choice;
    }
}
