package view;

import java.util.Scanner;

public class CharStringDataInput {
    // 캐릭터명 입력받기
    public String inputName() {
        String name;
        // 이름 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("캐릭터 닉네임을 입력하세요:");
        name = sc.next();
        return name;
    }
    // 차량 구매 여부를 입력받는 메서드
    public char inputCarYesOrNo() {
        char YesOrNo;
        // 차 구매여부 묻기
        System.out.println("차를 구매하시겠습니까? (Y/N)");
        Scanner sc = new Scanner(System.in);
        YesOrNo = sc.next().charAt(0);
        return YesOrNo;
    }
    // 차량 탑승 여부를 입력받는 메서드
    public char inputRideYesOrNo() {
        char YesOrNo;
        // 차량 탑승 여부 묻기
        System.out.println("차량에 탑승하시겠습니까? (Y/N)");
        Scanner sc = new Scanner(System.in);
        YesOrNo = sc.next().charAt(0);
        return YesOrNo;
    }
    // 새로운 차량에 탑승할지 여부
    public char inputNewCarYesOrNo() {
        char YesOrNo;
        // 차량 탑승 여부 묻기
        System.out.println("새로운 차량에 탑승하시겠습니까? (Y/N)");
        Scanner sc = new Scanner(System.in);
        YesOrNo = sc.next().charAt(0);
        return YesOrNo;
    }
    // 차량에서 하차할 지 여부 묻기
    public char inputTakeOffYesOrNo() {
        char YesOrNo;
        // 차량 탑승 여부 묻기
        System.out.println("새로운 차량에 탑승하시겠습니까? (Y/N)");
        Scanner sc = new Scanner(System.in);
        YesOrNo = sc.next().charAt(0);
        return YesOrNo;
    }
    // 생성한 캐릭터 사용 여부 확인
    public char inputUseOrNot() {
        // 생성핧 캐릭터를 바로 사용할 지 묻기
        Scanner sc = new Scanner(System.in);
        System.out.println("생성한 캐릭터를 사용하시겠습니까?('Y'입력 → 사용, 그 외 입력 → 현재 캐릭터 사용)");
        char choice = sc.next().charAt(0);
        return choice;
    }

    // 입력이 잘못되었을 때 메세지
    public void wrongInput() {
        System.out.println("'Y' 혹은 'N'를 입력하세요 (※ 대문자로 입력)");
    }
}
