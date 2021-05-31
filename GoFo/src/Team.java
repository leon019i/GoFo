import java.util.ArrayList;

public class Team {
    public Team() {
        this.name = "";
        this.teamNumber = 0;
    }

    String name;
    int teamNumber;
    ArrayList<Player> playerArrayList = new ArrayList<Player>(11);


    boolean isEmpty() {
        if (playerArrayList.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if (playerArrayList.size() != 0) {
            return true;
        } else {
            return false;
        }
    }

    void addPlayer(Player player) {
        if (teamNumber >= 11) {
            playerArrayList.add(player);
        }
    }
    @Override
    public String toString(){
    return ("team number: "+teamNumber+'\n'+"team name: "+name);
    }


}
