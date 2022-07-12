import java.util.Scanner;

public class controller {

}

class human {
    String name = "";
    boolean[] garage = new boolean[3];

    // 이름 입력받기
    void getName() {
        String name;
        // 이름 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("캐릭터 닉네임을 입력하세요");
        name = sc.next();
        // 입력받은 이름을 전달
        this.name = name;
        // 이름 출력
        System.out.printf("캐릭터 이름: %s\n", this.name);
    }

    // 차 구매) carNum → 1: bentley, 2: ferrari, 3: genesis
    void getCar() {
        int carNum = 0;
        // 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("구매할 차의 번호를 입력하세요: 1. bentley 2. ferrari 3. genesis");
        carNum = Integer.parseInt(sc.next());

        if(carNum != 1 && carNum != 2 && carNum != 3) {
            System.out.println("1, 2, 3 중 하나의 수를 입력하세요");
        }
        // 입력받은 차를 차고에 채우기
        else {
            if (carNum == 1) {
                if (garage[0]) System.out.println("이미 bentley를 가지고 있습니다");
                else {
                    garage[0] = true;
                    System.out.printf("%s(이)가 %s를 구매했습니다\n", this.name, "bentley");
                }

            } else if (carNum == 2) {
                if (garage[1]) System.out.println("이미 ferrari를 가지고 있습니다");
                else {
                    garage[1] = true;
                    System.out.printf("%s(이)가 %s를 구매했습니다\n", this.name, "ferrari");
                }

            } else if (carNum == 3) {
                if (garage[2]) System.out.println("이미 genesis를 가지고 있습니다");
                else {
                    garage[2] = true;
                    System.out.printf("%s(이)가 %s를 구매했습니다\n", this.name, "genesis");
                }

            }
            // 차고 상태 출력
            printGarage();
        }
    }

    // 차 판매) carNum → 1: bentley, 2: ferrari, 3: genesis
    void sellCar(int carNum) {
        if(carNum != 1 && carNum != 2 && carNum != 3) {
            System.out.println("1, 2, 3 중 하나의 수를 입력하세요");
        }
        // 입력받은 차를 차고에서 비우기
        else {
            if (carNum == 1) {
                if (!garage[0]) System.out.println("bentley를 가지고 있지 않습니다");
                else {
                    garage[0] = false;
                    System.out.printf("%s(이)가 %s를 판매했습니다\n", this.name, "bentley");
                }

            } else if (carNum == 2) {
                if (!garage[1]) System.out.println("ferrari를 가지고 있지 않습니다");
                else {
                    garage[1] = false;
                    System.out.printf("%s(이)가 %s를 판매했습니다\n", this.name, "ferrari");
                }

            } else if (carNum == 3) {
                if (!garage[2]) System.out.println("genesis를 가지고 있지 않습니다");
                else {
                    garage[2] = false;
                    System.out.printf("%s(이)가 %s를 판매했습니다\n", this.name, "genesis");
                }
            }
            // 차고 상태 출력
            printGarage();
        }
    }

    void printGarage() {
        System.out.printf("현재 보유 차량: ");
        if(garage[0]) System.out.printf("bentley ");
        else if(garage[1]) System.out.printf("ferrari ");
        else if(garage[2]) System.out.printf("genesis ");
        System.out.printf("\n");
    }
}
