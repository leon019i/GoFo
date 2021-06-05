import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void mainMenu() {
        System.out.println("Welcome to GoFo\n1-SignUp as a player\n2-SignUp as a playground owner");

    }

    public static void secondMenu(int choice) {
        String name, location, password, phone, email;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name and email and phone number and location and password");
        name=scanner.next();
        email=scanner.next();
        phone=scanner.next();
        location=scanner.next();
        password=scanner.next();
        if (choice == 1) {
           Player player=new Player(name,location,password,phone,email);
            ArrayList<Player> playerArrayList =new ArrayList<>(5);
            playerArrayList.add(player);
            System.out.println("1-book playground\n2-view play grounds");
            choice=scanner.nextInt();
            if(choice==1){

            }
            else if(choice==2){

            }
            else {
                System.out.println("invalid choice");
            }
        }else if (choice == 2){
            //System.out.println("Enter the email and password\nHint put ',' between the email and password");
            PlaygroundOwner owner =new PlaygroundOwner(name,email,phone,location,password);
            ArrayList<PlaygroundOwner> ownerArrayList =new ArrayList<>(5);
            ownerArrayList.add(owner);
            System.out.println("1-add play ground\n2-view play ground");
            Playground playground;
        }else {
            System.out.println("invalid choice");
        }
    }

    public static void main(String[] args) {
        //user user1 =new user("loay","17  st dokki","Password","01098790730","loayfaiz@gmail.com");
        boolean flag = true;

        while (flag) {
            //System.out.println(userArrayList);
            int choice;

            boolean valid=false;

            mainMenu();
           // choice = scanner.nextInt();
       /*     if (choice == 1) {
              //  System.out.println("Enter your name and email and phone number and location and password\nHint press enter after typing each credential");

                Player user3=new Player(name,location,password,phone,email);
                userArrayList.add(user3);
                System.out.println(userArrayList);
                System.out.println("1-bookPlayground\n2-viewPlaygrounds");
                choice=scanner.nextInt();
                if(choice==1){
                    Playground p1 = new Playground("abc",true, 50.0, "giza", 20.0);
                    p1.Hours.add("1-10-12am");
                    p1.Hours.add("1-2am");
                    p1.Hours.add("4-5am");
                    p1.date.add("10/2");
                    p1.date.add("11/2");
                    p1.date.add("12/2");
                    user3.bookPlayground(p1);
                    int numOfslot= scanner.nextInt();
                   // p1.Hours.remove(numOfslot-1);
                   // p1.date.remove(numOfslot-1);
                }

            }else if (choice==2){
                System.out.println("Enter the email and password\nHint put ',' between the email and password");
                email=scanner.next();
                password=scanner.next();
//                for (int i = 0; i<= userArrayList.size(); i++){
//                    if (userArrayList.get(i).getEmail()==email && userArrayList.get(i).getPassword()==password){
//                        valid=true;
//                        System.out.println(userArrayList.get(i));
//                    }else if (valid){
//                        break;
//                    }
//                    else {
//                        System.out.println("the credentials is not valid");
//                    }
//                }
  /**              for (user userSearch : userArrayList){
                    if (userSearch.getEmail()==email && userSearch.getPassword()==password){
                        System.out.println(userSearch);
                        System.out.println("done");
                    }
                    else {
                        System.out.println("failed");
                    }
                }
*/
   /*         }else {
                System.out.println("invalid choice");

            }
*/

        }







    }
}
