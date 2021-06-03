import java.util.Scanner;

public class Player extends user{
    private Team team;
    private Wallet wallet;

      public Player(){
            team=null;
            wallet=null;

      }
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team1) {
        team = team1;
    }

    public Player(String name, String location, String password, String phone, String email, Team team1) {
        super(name, location, password, phone, email);
        team = team1;
    }

    public Player(Team team1) {
        team = team1;
    }

    public Player(String name, String location, String password, String phone, String email) {
        super(name, location, password, phone, email);
    }

    public void checkMoney(){
        System.out.println("Player money is: "+wallet.getMoney());
    }
     public void bookPlayground(Playground playground){
         playground.freeSlots();
         System.out.println("select the number of free slot you want");
         Scanner scanner = new Scanner(System.in);

     }

    public void joinTeam(String nickName,Team team) {
          if(team.isEmpty()==true) {
              team.toString();
              team.addPlayer(this);
          }
          else{
              System.out.println("sorry team is full");
          }


    }
}
