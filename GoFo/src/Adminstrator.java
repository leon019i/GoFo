
import java.util.ArrayList;


public class Adminstrator extends user {
     ArrayList<Playground> playgroundArrayList=new ArrayList<Playground>();
    private Wallet wallet;

    public Adminstrator(ArrayList<Playground> playgroundArrayList, Wallet wallet) {
        this.playgroundArrayList = playgroundArrayList;
        this.wallet = wallet;
    }

    public void activatePlayground(Playground playground){
       Playground playground1 = null ;
       boolean suspended = true , activated = false ; 
       suspended = playground1.getState();
       if(this.getBookings()!=2)
          activated = playground1.getState();
          
        
    }
    
    public boolean suspendPlayground(boolean state){
        Playground playground1 = null ; 
        boolean active = true ; 
        active = playground1.getState() ;
       if( this.getBookings() ==2)
           return !active ; 
       else 
           return active ; 
    }
    
    public void deletePlayground(Playground playground){
      playgroundArrayList.remove(playground);
    }

}
