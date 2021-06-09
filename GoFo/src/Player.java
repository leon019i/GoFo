import java.util.Scanner;

/**
 * @author loay fayez id:20190396
 * @version 1.0
 */
public class Player extends user{
    private Team team;
    private Wallet wallet;

    /**
     * A default constructor initializes the player with null values
     */
    public Player(){
        team=null;
        wallet=null;

    }

    /**
     * gets the team the player in
     * @return an object of team for the player's team
     */
    public Team getTeam() {
        return team;
    }

    /**
     * sets the team for the player
     * @param team1 an container for player's team
     */
    public void setTeam(Team team1) {
        team = team1;
    }

    /**
     * a paramitrized constructor that creates a object with a specific credentials
     * @param name contains the player name
     * @param location contains the player location
     * @param password contains the player location
     * @param phone contains thr player's phone number
     * @param email contains the player's email
     * @param team1 contain the player's team
     */
    public Player(String name, String location, String password, String phone, String email, Team team1) {
        super(name, location, password, phone, email);
        team = team1;
    }

    /** a parametrized constructor that sets the players information
     * @param name a container contains the name to set it to the player
     * @param location a container contains the location to set it to the player
     * @param password a container contains the password to set it to the player
     * @param phone a container contains the phone number to set it to the player
     * @param email a container contains the email to set it to the player
     */
    public Player(String name, String location, String password, String phone, String email) {
        super(name, location, password, phone, email);
    }

    /** a parametrized constructor that sets the players information
     * @param name a container contains the name to set it to the player
     * @param location a container contains the location to set it to the player
     * @param password a container contains the password to set it to the player
     * @param phone a container contains the phone number to set it to the player
     * @param email a container contains the email to set it to the player
     * @param team a container contains the team to set it to the player
     * @param wallet a container contains the wallet to set it to the player
     */
    public Player(String name, String location, String password, String phone, String email, Team team, Wallet wallet) {
        super(name, location, password, phone, email);
        this.team = team;
        this.wallet = wallet;
    }

    /** a parametrized constructor that sets the players team and wallet
     * @param team a container contains the team to set it to the player
     * @param wallet a container contains the wallet to set it to the player
     */
    public Player(Team team, Wallet wallet) {
        this.team = team;
        this.wallet = wallet;
    }

    /** a parametrized constructor that sets the players team
     * a constructor fro the player with the players team
     * @param team1 contains the player's team
     */
    public Player(Team team1) {
        team = team1;
    }

    /**
     * method prints the player's wallet and money
     */
    public void checkMoney(){
        System.out.println("Your money is: "+wallet.getMoney());
    }

    /**
     * a method books a playground to the user
     * @param playground contains the playgrounds the player chosen
     */
    public void bookPlayground(Playground playground){
        playground.freeSlots();
        if(playground.Hours.size()!=0) {
            System.out.println("select the number of free slot you want");
            Scanner scanner = new Scanner(System.in);
            int numOfslot = scanner.nextInt();
            playground.Hours.remove(numOfslot - 1);
            playground.date.remove(numOfslot - 1);
        }

    }
}