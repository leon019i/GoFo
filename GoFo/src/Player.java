public class Player extends user{
    private Team team;
    private Wallet wallet;


    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Player(String name, String location, String password, String phone, String email, Team team) {
        super(name, location, password, phone, email);
        this.team = team;
    }

    public Player(Team team) {
        this.team = team;
    }

    public Player(String name, String location, String password, String phone, String email) {
        super(name, location, password, phone, email);
    }

    public void checkMoney(){
        System.out.println("Your money is: "+this.wallet.getMoney());
    }

}
