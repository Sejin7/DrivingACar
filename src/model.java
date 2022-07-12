import java.util.Scanner;

public class model {

}

// car parent class
class car {
    void drive() {

    }
    void stop() {

    }
}

// bentley, ferrari, genesis → car를 상속받아 생성
class bentley extends car {
    String name = "bentley";
    // overriding
    void drive() {
        System.out.println("부르릉");
    }
    void stop() {
        System.out.println("끼이익");
    }
}

class ferrari extends car {
    String name = "ferrari";
    // overriding
    void drive() {
        System.out.println("붕-");
    }
    void stop() {
        System.out.println("끽-");
    }
}

class genesis extends car {
    String name = "genesis";
    // overriding
    void drive() {
        System.out.println("부부르릉");
    }
    void stop() {
        System.out.println("끼리리릭");
    }
}