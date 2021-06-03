
import java.util.ArrayList;
import java.util.WeakHashMap;

public class Adminstrator extends user {
    ArrayList<Playground> playgroundArrayList=new ArrayList<Playground>();
    private Wallet wallet; 
    
    public Adminstrator(String name,String location , String password ,String phone,String email ){
      super( name, location , password , phone, email);  
    }
    
    public void activatePlayground(Playground playground){
      // Playground playground1 = null ;
       boolean suspended = true , activated = false ; 
       suspended = playground.getState();
        
      for(int i=0;i< playground.Hours.size();i++)
           if(playground.Hours.get(i).equals(playground.Hours.get(i+1)))
        
          activated = playground.getState();
          

    }
    
    public boolean suspendPlayground(boolean state){
       
        return state; 
        
    }
    
    public void deletePlayground(Playground playground){
      playgroundArrayList.remove(playground);
    }
    
   public void viewAllWallets(Player player, PlaygroundOwner playgroundOwner){
        
     player.checkMoney();
     playgroundOwner.checkMoney();
       
     
    }
    
}
