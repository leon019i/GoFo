import java.util.ArrayList;

/**
 * class playground owner which has all the information of the play ground owner
 * @author yomna mahmoud abd el wahab
 * @version 1.8
 */
public class PlaygroundOwner extends user{
    private Wallet wallet;
    ArrayList<Playground> playgroundArrayList=new ArrayList<Playground>();

    /**
     * parametrized constructor that sets the information of the playground owner
     * @param name of the playground owner
     * @param location of the playground owner
     * @param password of the playground owner
     * @param phone of the playground owner
     * @param email of the playground owner
     */
    public PlaygroundOwner(String name, String location, String password, String phone, String email) {
        super(name, location, password, phone, email);
    }

    /**
     * default constructor that sets the wallet and array list if the playground
     */
    public PlaygroundOwner() {
        playgroundArrayList=new ArrayList<Playground>(0);
        wallet=null;
    }

    /**
     * method to add a playground to the list of playgrounds that the playground owner has
     * @param playground that will be added in the list
     */
    void registerPlayground(Playground playground){

        playgroundArrayList.add(playground);
    }

    /**
     * method to view the playgrounds
     */
    void viewPlaygrounds() {
        for (int i = 0; i < playgroundArrayList.size(); i++) {
            System.out.println((i+1)+"-"+playgroundArrayList.get(i));
            System.out.println("---------------------------");
        }
    }

    /**
     * method to check the Money that playground owner has
     */
     public void checkMoney(){
        System.out.println("Playground Owner money is: "+this.wallet.getMoney());
    }
}
