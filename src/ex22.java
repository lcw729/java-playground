import java.util.Random;

enum RSP {ROCK, SCISSORS, PAPER};

public class ex22 {
    public static void main(String[] args) {
        /*
        철수가 가위를 낼 확률은 1/10이고, 바위를 낼 확률은 5/10,
        보를 낼 확률은 4/10이다.
         */

        while (true) {
            RSP ai = AI();
            RSP human = Human();
            if (ai == human)
                System.out.println("무승부");
            else if ((ai == RSP.PAPER && human == RSP.SCISSORS)
                    || (ai == RSP.SCISSORS && human == RSP.ROCK)
                    || (ai == RSP.ROCK && human == RSP.PAPER)) break;
        }
    }

    static RSP AI() {
        Random random = new Random();
        int num = random.nextInt(10) + 1;

        System.out.print("AI :");
        if (num >= 1 && num <= 3) {
            System.out.println("ROCK");
            return RSP.ROCK;
        } else if (num > 3 && num <= 6) {
            System.out.println("SCISSORS");
            return RSP.SCISSORS;
        } else {
            System.out.println("PAPER");
            return RSP.PAPER;
        }
    }

    static RSP Human() {
        Random random = new Random();
        int num = random.nextInt(10) + 1;

        System.out.print("Human :");
        if (num >= 1 && num < 2) {
            System.out.println("SCISSORS");
            return RSP.SCISSORS;
        } else if (num >= 2 && num <= 6) {
            System.out.println("ROCK");
            return RSP.ROCK;
        } else {
            System.out.println("PAPER");
            return RSP.PAPER;
        }
    }
}
