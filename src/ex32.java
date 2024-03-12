class FishBun { // 일반 붕어빵 : 일반 객체
    int bunNo = 10;
}

class UniqueFishBun { // 절대 붕어빵 : 싱글톤
    int bunNo = 30;
    private static UniqueFishBun singleton;
    static UniqueFishBun getInstance() {
        if (singleton == null) {
            singleton = new UniqueFishBun();
        }
        return singleton;
    }
}

public class ex32 {
    public static void main(String[] args) {
        UniqueFishBun uBun1 = UniqueFishBun.getInstance(); // UniqueFishBun@7a81197d
        UniqueFishBun uBun2 = UniqueFishBun.getInstance(); // UniqueFishBun@7a81197d
        System.out.println(uBun1);
        System.out.println(uBun2);

        FishBun bun1 = new FishBun();
        FishBun bun2 = new FishBun();
        FishBun bun3 = new FishBun();

        System.out.println(bun1);
        System.out.println(bun2);
        System.out.println(bun3);
    }
}
