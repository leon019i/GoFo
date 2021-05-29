import java.util.ArrayList;

public class Team {
    public Team() {
        this.name = "";
        this.teamNumber = 0;
    }

    String name;
    int teamNumber;
    ArrayList<Player> playerArrayList= new ArrayList<Player>(11);


    boolean isEmpty() {
        return false;
    }
    boolean isFull() {
        return false;
    }
    void addPlayer(Player player1){
        if (teamNumber>=11) {
            playerArrayList.add(player1);
        }
    }

}
