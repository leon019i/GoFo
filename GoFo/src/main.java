import java.util.ArrayList;
import java.util.Scanner;

public class main {



    public static void mainMenu() {
        System.out.println("Welcome to GoFo\n1-SignUp\n2-SignIn");

    }

    public static void secondMenu(int choice) {
        if (choice == 1) {
            System.out.println("Enter your name and email and phone number and location and password");
        }else if (choice==2){
            System.out.println("Enter the email and password\nHint put ',' between the email and password");
        }else {
            System.out.println("invalid choice");
        }
    }

    public static void main(String[] args) {
        user user1 =new user("loay","17  st dokki","Password","01098790730","loayfaiz@gmail.com");

        boolean flag = true;
        ArrayList<user> userArrayList =new ArrayList<>(5);
        userArrayList.add(user1);
        while (flag) {
            System.out.println(userArrayList);
            int choice;
            String name, location, password, phone, email;
            boolean valid=false;
            Scanner scanner = new Scanner(System.in);
            mainMenu();
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Enter your name and email and phone number and location and password\nHint press enter after typing each credential");
                name=scanner.next();
                email=scanner.next();
                phone=scanner.next();
                location=scanner.next();
                password=scanner.next();
                user user3=new user("loay","17  st dokki","Password","01098790730","loayfaiz@gmail.com");
                userArrayList.add(user3);
                System.out.println(userArrayList);

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
                for (user userSearch : userArrayList){
                    if (userSearch.getEmail()==email && userSearch.getPassword()==password){
                        System.out.println(userSearch);
                        System.out.println("done");
                    }
                    else {
                        System.out.println("failed");
                    }
                }

            }else {
                System.out.println("invalid choice");

            }


        }
    }
}
