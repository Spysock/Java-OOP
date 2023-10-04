import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap<String, Profile> map1 = new HashMap<String, Profile>();
        boolean quit = false;
        Scanner userInput = new Scanner(System.in);
        Profile newUser = new Profile();
        String q;

        while(quit == false){
            System.out.println("Welcome to Lab07:");
            System.out.print("Enter user first name: ");
            newUser.setFirstName(userInput.nextLine());
            System.out.print("Enter user last name: ");
            newUser.setLastName(userInput.nextLine());
            newUser.setUserName(newUser.getFirstName() + newUser.getLastName());
            System.out.println("Your username is: " + newUser.getUserName());
            System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
            newUser.setDateOfBirth(userInput.nextLine());
            System.out.print("Enter password: ");
            newUser.setProfilePassword(userInput.nextLine());
            map1.put(newUser.getUserName(), newUser);
            System.out.println("\n");
            System.out.println("User registered!");
            System.out.print("Enter Q to quit the app!: ");
            q = userInput.nextLine();
            System.out.println("\n");
            quit = true;
        }

        for(HashMap.Entry<String, Profile> user: map1.entrySet()){
             user.getValue().printProfile();
        }
    }
}
