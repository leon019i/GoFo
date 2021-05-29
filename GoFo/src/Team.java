import java.util.ArrayList;

public class Team {
    public Team() {
        this.name = "";
        this.teamNumber = 0;
    }

    String name;
    int teamNumber;
    ArrayList<user> userArrayList = new ArrayList<user>(11);


    boolean isEmpty() {
        return false;
    }
    boolean isFull() {
        return false;
    }
    void addPlayer(user user1){
        if (teamNumber>=11) {
            userArrayList.add(user1);
        }
    }

}
