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
        user user = new user();
        boolean flag = true;
        ArrayList<user> userArrayList =new ArrayList<>(5);
        userArrayList.add(user1);
        while (flag) {
            System.out.println(userArrayList);
            int choice;
            String data;
            String[] data_;
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
                user user3=new user(name,location,password,phone,email);
                userArrayList.add(user3);
                System.out.println(userArrayList.toString());


            }else if (choice==2){
                System.out.println("Enter the email and password\nHint put ',' between the email and password");
                email=scanner.next();
                password=scanner.next();
                for (int i = 0; i<= userArrayList.size(); i++){
                    if (userArrayList.get(i).getEmail()==email && userArrayList.get(i).getPassword()==password && valid!=true){
                        valid=true;
                    }else if (valid){
                        break;
                    }
                    else {
                        System.out.println("the credentials is not valid");
                    }
                }

            }else {
                System.out.println("invalid choice");

            }


        }
    }
}