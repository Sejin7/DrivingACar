package view;

public class SelectCar {
    // 차량 구매
    public void getCar(int carNum, String name, boolean[] garage) {
        // 선택한 차량을 이미 가지고 있는 경우 재입력, 그렇지 않은 경우 차고에 추가
        if (carNum == 1) {
            if (garage[0]) System.out.println("이미 bentley를 가지고 있습니다");
            else {
                garage[0] = true;
                System.out.printf("%s(이)가 %s를 구매했습니다\n", name, "model.bentley");
            }

        } else if (carNum == 2) {
            if (garage[1]) System.out.println("이미 ferrari를 가지고 있습니다");
            else {
                garage[1] = true;
                System.out.printf("%s(이)가 %s를 구매했습니다\n", name, "model.ferrari");
            }

        } else if (carNum == 3) {
            if (garage[2]) System.out.println("이미 genesis를 가지고 있습니다");
            else {
                garage[2] = true;
                System.out.printf("%s(이)가 %s를 구매했습니다\n", name, "model.genesis");
            }
        } else {
            System.out.println("1, 2, 3 중 하나의 값을 입력하세요");
        }
    }
    // 차고에 있는 차량 판매
    public void sellCar(int carNum, String name, boolean[] garage) {
        // 선택한 차량을 소유하고 있지 않은 경우 재입력, 제대로 입력한 경우 차고에서 제거
        if (carNum == 1) {
            if (!garage[0]) System.out.println("bentley를 소유하고 있지 않습니다");
            else {
                garage[0] = false;
                System.out.printf("%s(이)가 %s를 판매했습니다\n", name, "model.bentley");
            }

        } else if (carNum == 2) {
            if (!garage[1]) System.out.println("ferrari를 소유하고 있지 않습니다");
            else {
                garage[1] = false;
                System.out.printf("%s(이)가 %s를 판매했습니다\n", name, "model.ferrari");
            }

        } else if (carNum == 3) {
            if (!garage[2]) System.out.println("genesis를 소유하고 있지 않습니다");
            else {
                garage[2] = false;
                System.out.printf("%s(이)가 %s를 판매했습니다\n", name, "model.genesis");
            }
        } else {
            System.out.println("1, 2, 3 중 하나의 값을 입력하세요");
        }
    }
    // 차량 탑승
    public void ridingCar(int carNum, String name, boolean[] garage) {
        // 선택한 차량을 소유하고 있지 않은 경우 재입력, 제대로 입력한 경우 탑승
        if (carNum == 1) {
            if (!garage[0]) System.out.println("bentley를 소유하고 있지 않습니다.");
            else System.out.printf("%s이(가) %s(에)를 탑승하였습니다.\n", name, "model.bentley");

        } else if (carNum == 2) {
            if (!garage[1]) System.out.println("ferrari를 소유하고 있지 않습니다.");
            else System.out.printf("%s이(가) %s(에)를 탑승하였습니다.\n", name, "model.ferrari");

        } else if (carNum == 3) {
            if (!garage[2]) System.out.println("ferrari를 소유하고 있지 않습니다.");
            else System.out.printf("%s이(가) %s(에)를 탑승하였습니다.\n", name, "model.genesis");
        } else System.out.println("1, 2, 3 중 하나의 값을 입력하세요");
    }
}
