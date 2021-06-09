import java.util.Scanner;

/**
 * @author loay fayez ,yomna mahmoud, nada mousa
 * @version 1.8
 */
public class main {
     public static Player player;
     public  static PlaygroundOwner owner;

    /**
     * method to make the user able to sign up
     * @param choice that the user choose
     */
    public static void Menu(int choice) {
        Scanner scanner = new Scanner(System.in);
        String name, location, password, phone, email;
        System.out.println("Enter your name and email and phone number and location and password");
        name=scanner.next();
        email=scanner.next();
        phone=scanner.next();
        location=scanner.next();
        password=scanner.next();
        if (choice == 1) {
            player =new Player(name,location,password,phone,email);
        }else if (choice == 2){
            owner =new PlaygroundOwner(name,email,phone,location,password);
            while(true) {
                System.out.println("adding a play ground process..");
                System.out.println("enter\n1-name\n2-cost\n3-location\n4-size");
                String playgroundName, playgroundLocation;
                double price, size;
                playgroundName = scanner.next();
                price = scanner.nextDouble();
                playgroundLocation = scanner.next();
                size = scanner.nextDouble();
                Playground playground = new Playground(playgroundName, true, price, playgroundLocation, size);
                System.out.println("enter 2 available hours and their date");
                String hours, date;
                System.out.println("enter the first available hour:");
                hours = scanner.next();
                System.out.println("enter its date");
                date = scanner.next();
                playground.addFreeSlots(hours, date);
                System.out.println("enter the second available hour");
                hours = scanner.next();
                System.out.println("enter its date");
                date = scanner.next();
                playground.addFreeSlots(hours, date);
                owner.registerPlayground(playground);
                System.out.println("1-register new playground\n2-exit");
                choice= scanner.nextInt();
                if(choice!=1){
                    break;
                }
            }
        }else {
            System.out.println("invalid choice");
        }
    }
    public static void main(String[] args) {

        while (true) {
            System.out.println("Welcome to GoFo\n1-SignUp as a player\n2-SignUp as a playground owner");
            Scanner scanner = new Scanner(System.in);
            int choice;
            choice=scanner.nextInt();
            Menu(choice);
             if(choice==1) {
                 System.out.println("1-view playground\n2-exit");
                 choice = scanner.nextInt();
                 if (choice == 1) {
                     int numberOfPlayground;
                     System.out.println("viewing Playgrounds..");
                         owner.viewPlaygrounds();
                     System.out.println("1-book playground\n2-exist");
                     choice = scanner.nextInt();
                     if (choice == 1) {
                         System.out.println("enter the number of the Playground you want to register");
                         numberOfPlayground = scanner.nextInt();
                         player.bookPlayground(owner.playgroundArrayList.get(numberOfPlayground-1));
                         System.out.println("Booking done successfully...");

                     }
                     else{
                         break;
                     }
                 }
                 else{
                     break;
                 }
             }

            }


            }

        }


