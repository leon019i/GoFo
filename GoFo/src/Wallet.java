public class Wallet {
    private double money;

    public Wallet(double money) {
        this.money = money;
    }

    public Wallet() {
        money=0;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money<0){
        this.money = money;}
        else {
            System.out.println("Error");
        }
    }
}
