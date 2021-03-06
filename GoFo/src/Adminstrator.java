import java.util.ArrayList;


/**
 * This class represents all the functionalities that the administrator does in the system such as : activating a playground , deleting a playground,etc 
 * 
 * @author Nada Mousa Abdelaziz
 * @version 1.8
 */
public class Adminstrator extends user {
    ArrayList<Playground> playgroundArrayList=new ArrayList<Playground>();
    private Wallet wallet; 
    
    /**
     * 
     * @param name name of the administrator 
     * @param location location of the administrator 
     * @param password password of the administrator 
     * @param phone phone number of the administrator 
     * @param email email of the administrator 
     */
    public Adminstrator(String name,String location , String password ,String phone,String email ){
      super( name, location , password , phone, email);  
    }
    
    /**
     * this function activate the playground and change its state from suspended to active 
     * @param playground the playground that needs to be activated 
     */
    public void activatePlayground(Playground playground){
      // Playground playground1 = null ;
       boolean suspended = true , activated = false ; 
       suspended = playground.getState();
        
      for(int i=0;i< playground.Hours.size();i++)
           if(playground.Hours.get(i).equals(playground.Hours.get(i+1)))
        
          activated = playground.getState();
          

    }
    
    /**
     * this function returns if the playground is suspended or not , if it is suspended it returns true , otherwise it is false
     * 
     * @param state state of the playground 
     * @return the state of the playground , so if it is true then it is suspended otherwise it is active 
     */
    public boolean suspendPlayground(boolean state){
       
        return state; 
        
    }
    
    /**
     * this function deletes a playground from the system 
     * @param playground playground that needs to be deleted 
     */
    public void deletePlayground(Playground playground){
      playgroundArrayList.remove(playground);
    }
    
    /**
     * This function displays the balance of both the player and the playground owner of this playground 
     * 
     * @param player player in the system 
     * @param playgroundOwner the playground owner that owns the playground that this player booked 
     */
   public void viewAllWallets(Player player, PlaygroundOwner playgroundOwner){
        
     player.checkMoney();
     playgroundOwner.checkMoney();
       
     
    }
    
}
