
public class Adminstrator extends User {
    
    private Wallet wallet; 
    
    public Adminstrator(String name,String location , String password ,String phone,String email ){
      super( name, location , password , phone, email);  
    }
    
    public void activatePlayground(Playground playground){
        
    }
    
    public boolean suspendPlayground(boolean state){
        boolean active = true ; 
        active = state ;
       if( this.getBookings() ==2)
           return !state ; 
       else 
           return state ; 
    }
    
    public void deletePlayground(Playground playground){
    
    }
    
    public Wallet viewAllWallets(){
        
    }
    
}
