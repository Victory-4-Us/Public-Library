//member class (child class)
//extends off of user.java and handles account display and creation methods
import java.util.Scanner;
public class Member extends user {
    Scanner sc = new Scanner(System.in);
    
    //overides the displayInfo method in user.java
    //prints out the current user and their info
    @Override 
    void displayInfo() {
        System.out.println("Account Number: " + acctNum);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Age Type: " + ageType);
        System.out.println("Items checked out: " + itemsOut);
    }

    //startup method to prompt the user to make a profile
    public void newUser() {
        System.out.println("Create a user profile to get started");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("Account number: ");
        acctNum = sc.nextInt();
        setUser(name, age, acctNum);
        System.out.println();
        System.out.println("All good to go!");
    }

    //this method uses exception handling to verify if the given answer is an int
    public int validInt(Scanner sc, String prompt) {
        int input = -1;
        boolean valid = false;

        while(!valid) {
            try {
                System.out.println(prompt);
                input = sc.nextInt();
                sc.nextLine();
                valid = true;
            } catch (Exception e) {
                System.out.println();
                System.out.println("Answer must be a number");
                sc.nextLine();
            }
        }

        return input;
    }
}
