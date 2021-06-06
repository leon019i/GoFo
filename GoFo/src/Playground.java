import java.util.ArrayList;

/**
 * This Class represents the playground in the system and all the functionalities related to it such as:adding free slots
 * and displaying name , size , and location of the playground
 * 
 * @author 
 */
public class Playground {
    String name;
    ArrayList<String> Hours =new ArrayList<String>(2);

    ArrayList<String> date=new ArrayList<String>(2);
    boolean state;
    double cost;
    String location;
    double size;

    /**
     * This default constructor initialises name and location of the playground to an empty string , state to false, and cost and size to 0
     */
    public Playground(){
         name="";
         state=false;
         cost=0;
         location="";
         size=0;

     }

    /**
     * 
     * @param name name of the playground
     * @param state state of the playground
     * @param cost  cost of booking the playground 
     * @param location location of the playground 
     * @param size size of the playground 
     */
    public Playground(String name, boolean state, double cost, String location, double size) {
        this.name = name;
        this.state =state;
        this.cost = cost;
        this.location = location;
        this.size = size;

    }
    
    /**
     * sets the name of the playground 
     */
     public void setName(){
        this.name = name ; 
    }
    
     /**
      * 
      * @return returns the name of the playground 
      */
    public String getName(){
        return name ; 
    }

    /**
     * sets the state of the playground 
     */
     public void setState(){
        this.state = state ; 
    }
    
    /**
      * 
      * @return returns the state of the playground 
      */
    public boolean getState(){
        return state ; 
    }
    
    /**
     * sets the cost of booking the playground 
     */
     public void setCost(){
        this.cost = cost ; 
    }
    
    /**
      * 
      * @return returns the cost of booking the playground 
      */
    public double getCost(){
        return cost ; 
    }
    
     /**
     * sets the location of the playground 
     */
     public void setLocation(){
        this.location = location ; 
    }
    
    /**
      * 
      * @return returns the location of the playground 
      */
    public String getLocation(){
        return location ; 
    }
    
     /**
     * sets the size of the playground 
     */
    public void setSize(){
        this.size = size ; 
    }
    
    /**
     * 
     * @return returns the size of the playground 
     */
    public Double getSize(){
        return size ; 
    }
    
    
     /**
     * this function add the free slots available in the playground by hour and date time  
     * 
     * @param Hour The hour available in the free slots 
     * @param Date The date available in the free slots 
     */
   public void addFreeSlots (String Hour,String Date){
        Hours.add(Hour);
        date.add(Date);
    }
    
    /**
    * this function return the free slots available in the playground and 
    * display a message that there is no free slots if the playground is full 
    */
    public void freeSlots (){
        if(Hours.size()==0){
            System.out.println("there are no free slots");
        }
        else {
            for (int i = 0; i < Hours.size(); i++) {
                System.out.println((i+1)+"-Time: " + Hours.get(i) + " " + "Date: " + date.get(i));
                System.out.println("-------------------------");
            }
        }
    }

     /**
     * 
     * @return returns name , size , and location of the playground 
     */
    public String toString(){
        return ("name: "+name+'\n'+"size: "+size+'\n'+"location: "+location+'\n'+"cost: "+cost);

    }
}
