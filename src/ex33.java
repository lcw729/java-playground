class HanaAccount {
    private static HanaAccount hanaAccount;

    static HanaAccount getInstance() {
        if (hanaAccount == null) {
            hanaAccount = new HanaAccount();
        }
        return hanaAccount;
    }

    // 필드 : 계좌번호, 고객이름, 잔액, 이자율
    private int account = 1234;
    private String name = "Hong";
    private double money = 1000;
    private double interestRate = 0.03;

    // 메소드 : 입금, 출금, 이자계산(1년후 잔액), 잔액조회
    void deposit () {
        this.money += 100;
    }

    void withdraw () throws OverdrawnException {
        if (this.money < 100)
            throw new OverdrawnException("출금 잔액이 부족합니다.");
        this.money -= 100;
    }

    void getInterestRate () {
        this.money *= (1 + this.interestRate);
    }

    void getMyMoney() {
        System.out.println(this.money);
    }
}

public class ex33 {
    public static void main(String[] args) {
        HanaAccount hanaAccount =  HanaAccount.getInstance();
        hanaAccount.deposit();
        try {
            hanaAccount.withdraw();
        } catch (OverdrawnException e) {
            e.printStackTrace();
        }
        hanaAccount.getInterestRate();
        hanaAccount.getMyMoney();
    }
}
