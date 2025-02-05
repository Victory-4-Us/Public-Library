//main class
import java.util.Scanner;
public class Library {
    public static void main(String[] args) throws Exception {

        //object creation
        Scanner sc = new Scanner(System.in);
        DVD dvd = new DVD();
        Book book = new Book();
        Magazine mag = new Magazine();
        Member member = new Member();

        //library materials (would be neater in a passable array)
        String bookTitle = "Tom goes to School";
        String bookArtist = "Vin Diesel";
        int bookLength = 180;

        String dvdTitle = "John Doe: the science bro";
        String dvdArtist = "Science for kids";
        int dvdLength = 35;

        String magTitle = "Mustaches Weekly";
        int magIssue = 55;
        int magLength = 23;

        //passes and assigns the library materials
        dvd.setDVD(dvdTitle, dvdArtist, dvdLength);
        book.setBook(bookTitle, bookArtist, bookLength);
        mag.setMagazine(magTitle, magIssue, magLength);

        //variables used for the interfaces
        boolean visiting = true;
        boolean op2;
        boolean op1;
        boolean op3;
        
        String answer;
        String pick = "Type a number to pick an option:";
        String wrong = "Invalid input. Try again";

        //a welcome and a prompt to have the user create a profile upon startup
        System.out.println("Hello and welcome to the library!");
        member.newUser();
        System.out.println();

        //main menu  navigation
        while(visiting) {
            System.out.println("***Main Menu***");
            System.out.println(pick);
            System.out.println("1. User settings");
            System.out.println("2. Check out materials");
            System.out.println("3. Return materials");
            System.out.println("4. Exit");
            answer = sc.nextLine();
            System.out.println();

            //user settings
            if(answer.equalsIgnoreCase("1")) {
                op1 = true;
                while(op1) {
                    System.out.println("***User Settings***");
                    System.out.println(pick);
                    System.out.println("1. Display current user profile");
                    System.out.println("2. Update name");
                    System.out.println("3. Update age");
                    System.out.println("4. Update account number");
                    System.out.println("5. Go back");

                    answer = sc.nextLine();
                    System.out.println();

                    //display current user profile option
                    if(answer.equalsIgnoreCase("1")) {
                        member.displayInfo();
                        System.out.println();

                    //update name option (name is updated and stored in user.java)
                    } else if(answer.equalsIgnoreCase("2")) {
                        System.out.println("User's name is currently " + member.getName());
                        System.out.print("What would you like to update it to: ");
                        member.updateName(sc.nextLine());
                        System.out.println();

                    //update age option (name is updated and stored in user.java)
                    //(answer is checked for validity in member.java and then passed)
                    } else if(answer.equalsIgnoreCase("3")) {
                        System.out.println("User's age is currently set to " + member.getAge());
                        System.out.print("What would you like to update it to: ");
                        member.updateAge(member.validInt(sc, "Please enter a valid age: "));
                        System.out.println();

                    //update account number option (account number is updated and stored in user.java)
                    //(answer is checked for validity in member.java and then passed)
                    } else if(answer.equalsIgnoreCase("4")) {
                        System.out.println();
                        System.out.println("User's account number is currently " + member.getAcctNum());
                        System.out.print("What would you like to update it to: ");
                        member.updateAcctNum(member.validInt(sc, "Please enter a number: "));
                        System.out.println();

                    //exit user menu and return to main menu option
                    } else if(answer.equalsIgnoreCase("5")) {
                        op1 = false;

                    //invalid answer (menu starts over)
                    } else {
                        System.out.println(wrong);
                        System.out.println();
                    }
                }

            //checkout item
            } else if(answer.equalsIgnoreCase("2")) {
                op2 = true;
                while(op2) {
                    System.out.println("***Check out materials***");
                    System.out.println(pick);
                    System.out.print("1. ");
                    dvd.displayInfo();
                    System.out.print("2. ");
                    book.displayInfo();
                    System.out.print("3. ");
                    mag.displayInfo();
                    System.out.println("4. Go back");

                    answer = sc.nextLine();
                    System.out.println();

                    //user picks which item they want to checkout
                    //(updates the state of the item to CHECKED OUT in media.java)
                    //(if properly checked out, the amount of items checked out is updated in user.java)
                    if(answer.equals("1")) {
                        System.out.println("You chose " + dvd.getTitle());
                        member.setItemsOut(dvd.checkoutItem());
                    } else if(answer.equals("2")) {
                        System.out.println("You chose " + book.getTitle());
                        member.setItemsOut(book.checkoutItem());
                    } else if(answer.equals("3")) {
                        System.out.println("You chose " + mag.getTitle());
                        member.setItemsOut(mag.checkoutItem());

                    //exit checkout menu and return to the main menu
                    } else if(answer.equals("4")) {
                        op2 = false;
                    
                    //invalid answer (menu starts over)
                    } else {
                        System.out.println(wrong);
                        System.out.println();
                    }
                }

            //return item
            } else if(answer.equalsIgnoreCase("3")) {
                op3 = true;
                while(op3) {
                    System.out.println("***Return materials***");
                    System.out.println(pick);
                    System.out.print("1. ");
                    dvd.displayInfo();
                    System.out.print("2. ");
                    book.displayInfo();
                    System.out.print("3. ");
                    mag.displayInfo();
                    System.out.println("4. Go back");

                    answer = sc.nextLine();
                    System.out.println();

                    //user picks which item they want to return
                    //(updates the state of the item to NOT CHECKED OUT in media.java)
                    //(if properly returned, the amount of items checked out is updated in user.java)
                    if(answer.equals("1")) {
                        System.out.println("You chose " + dvd.getTitle());
                        member.setItemsOut(dvd.returnItem());
                    } else if(answer.equals("2")) {
                        System.out.println("You chose " + book.getTitle());
                        member.setItemsOut(book.returnItem());
                    } else if(answer.equals("3")) {
                        System.out.println("You chose " + mag.getTitle());
                        member.setItemsOut(mag.returnItem());
                    } else if(answer.equals("4")) {
                        op3 = false;

                    //invalid answer (menu starts over)
                    } else {
                        System.out.println(wrong);
                        System.out.println();
                    }
                }

            //goodbye (ends program)
            } else if(answer.equalsIgnoreCase("4")) {
                System.out.println("Goodbye");
                visiting = false;

            //invalid answer (stars menu over)
            } else {
                System.out.println(wrong);
                System.out.println();
            }
        }

        //closes scanner
        sc.close();
    }
}
