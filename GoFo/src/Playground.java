import java.util.ArrayList;

public class Playground {
    String name;
    ArrayList<String> Hours;
    ArrayList<String> date ;
    boolean state;
    double cost;
    String location;
    double size;

    public Playground(){
         name="";
         state=false;
         cost=0;
         location="";
         size=0;
     }

    public Playground(String name, boolean state, double cost, String location, double size) {
        this.name = name;
        this.state =state;
        this.cost = cost;
        this.location = location;
        this.size = size;
        Hours = new ArrayList<String>(0);
        date = new ArrayList<String>(0);
    }
   public void addFreeSlots (String Hour,String Date){
        Hours.add(Hour);
        date.add(Date);
    }
    public void freeSlots (){
        for(int i=0; i< Hours.size(); i++){
            System.out.println("Time: "+Hours.get(i) +" "+"Date: "+ date.get(i));
        }
    }


}
