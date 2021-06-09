

/**
 * Class Wallet represents the balance in each user of the system's e-Wallet
 * 
 * @author nada mousa abd el aziz
 * @version 1.8
 */
public class Wallet {
    private double money;

    /**
      * 
      * @param money money on e-Wallet of the user
      */
    public Wallet(double money) {
        this.money = money;
    }

     /**
     * This default constructor initialises money on e-Wallet to zero 
     */
    public Wallet() {
        money=0;
    }

    /**
     * 
     * @return returns the user's money on e-Wallet
     */
    public double getMoney() {
        return money;
    }

     /**
     * This function the money of the user on e-Wallet
     * 
     * @param money money of the user on e-Wallet
     */
    public void setMoney(double money) {
        if (money<0){
        this.money = money;}
        else {
            System.out.println("Error");
        }
    }
}
