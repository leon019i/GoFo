
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
       if(this.getBookings()!=2)
          activated = playground.getState();
          

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
    
    public Wallet viewAllWallets(){

    }
    
}
