class Desk {
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price = 1000;

}

public class ex30 {
    public static void main(String[] args) {
        Desk desk = new Desk();
        desk.setPrice(2000);
        System.out.println(desk.getPrice());
    }
}
