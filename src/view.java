import java.util.Scanner;

public class view {
    void initialView() {
        // 필요한 변수 선언
        char YesOrNo = '0';

        human user1 = new human();
        user1.getName();

        while(true){
            // 차 구매여부 묻기
            System.out.println("차를 구매하시겠습니까? (Y/N)");
            Scanner sc = new Scanner(System.in);
            YesOrNo = sc.next().charAt(0);
            // 차를 구매하지 않거나 구매
            if(YesOrNo == 'N') {
                user1.printGarage();
                break;
            }
            else if(YesOrNo == 'Y') {
                user1.getCar();
                break;
            }
            else System.out.println("'Y' 혹은 'N'를 입력하세요 (※ 대문자로 입력)");
        }


    }
}
