import java.util.ArrayList;

public class PlaygroundOwner extends user{
    private Wallet wallet;
    ArrayList<Playground> playgroundArrayList=new ArrayList<Playground>();
    public PlaygroundOwner(String name, String location, String password, String phone, String email) {
        super(name, location, password, phone, email);
    }

    public PlaygroundOwner() {
        playgroundArrayList=new ArrayList<Playground>(0);
        wallet=null;
    }
    void registerPlayground(Playground playground){

        playgroundArrayList.add(playground);
    }
    void viewPlaygrounds(){
        System.out.println(playgroundArrayList);
    }
    public void checkMoney(){
        System.out.println("Your money is: "+wallet.getMoney());
    }
}
