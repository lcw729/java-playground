
public class ex57 {
    public static void main(String[] args) {
        HanaAccount hanaAccount = new HanaAccount();
        try {
            for (int i = 0; i < 13; i++)
                hanaAccount.withdraw();
        } catch (OverdrawnException e) {
            e.printMessage();
        }
    }
}

class OverdrawnException extends Exception {
    String message = "";

    OverdrawnException(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(this.message);
    }
}