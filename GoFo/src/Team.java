import java.util.ArrayList;

/**
 * class Team that has a relation with the player
 * @author yomna mahmoud abd el wahab
 * @version 1.0
 */
public class Team {
    /**
     * default constructor sets the name and team number to null values
     */
    public Team() {
        this.name = "";
        this.teamNumber = 0;
    }

    String name;
    int teamNumber;
    ArrayList<Player> playerArrayList = new ArrayList<Player>(11);

    /**
     * method to check if the team empty or not
     * @return ture if the team is empty and false otherwise
     */
    boolean isEmpty() {
        if (playerArrayList.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * method to check if the team is full or not
     * @return  ture if the team is full and false otherwise
     */

    boolean isFull() {
        if (playerArrayList.size() != 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * method to add a player to the team
     * @param player which is going to be added in the team
     */

    void addPlayer(Player player) {
        if (teamNumber >= 11) {
            playerArrayList.add(player);
        }
    }

    /**
     *
     * @return team's information (name and number)
     */
    @Override
    public String toString(){
    return ("team number: "+teamNumber+'\n'+"team name: "+name);
    }


}
