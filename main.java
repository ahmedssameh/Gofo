import java.util.Scanner;

/**
 * main class to test cases.
 */
public class main extends gofo {
    /**
     * registration menu.
     * @return a choice.
     */
    static int registrationMenu(){
        System.out.println("Register Now!");
        System.out.println("1-Sign up as playground owner");
        System.out.println("2-Sign up as player");
        System.out.println("3-Exit");
        Scanner in = new Scanner(System.in) ;
        int choice = in.nextInt();
        return choice;
    }
    /**
     * Owner menu.
     * @return Owner choice.
     */
    static int owner(){
        System.out.println("Welcome Owner!");
        System.out.println("Choose what you want to do please!");
        System.out.println("1-Add a new playground");
        System.out.println("2-Go Back!");
        Scanner in = new Scanner(System.in) ;
        int choice = in.nextInt();
        return choice;
    }
    /**
     * player menu
     * @return player choice.
     */
    static int player(){
        System.out.println("Welcome Player!");
        System.out.println("Choose what you want to do please!");
        System.out.println("1-Search for a play ground");
        System.out.println("2-Make an Ewallet");
        System.out.println("3-Go Back!");
        Scanner in = new Scanner(System.in) ;
        int choice = in.nextInt();
        return choice;
    }
    public static void main(String args[]){
        while(true){
            gofo Gofo=new gofo();
            int type=registrationMenu();
            Scanner in=new Scanner(System.in);
        if(type==1){
            System.out.println("you are about to sign up as owner");
            System.out.println("Enter your first name: ");
            String FirstName=in.next();
            System.out.println("Enter your last name: ");
            String LastName=in.next();
            System.out.println("Enter your e-mail: ");
            String Email=in.next();
            System.out.println("Enter your password: ");
            String password=in.next();
            System.out.println("Enter your location: ");
            String location=in.next();
            System.out.println("Enter your phone number: ");
            String phone=in.next();
            Owner owner=new Owner(FirstName,LastName,Email,password,location,phone);
            Gofo.addOwner(owner);
            while(true){
                int ownerChoice = owner();
                if (ownerChoice == 1) {
                    System.out.println("Enter playground location");
                    String PLocation = in.next();
                    System.out.println("Enter available Date for playground");
                    String date = in.next();
                    System.out.println("Enter available Time");
                    int time = in.nextInt();
                    System.out.println("Enter playground booking price per hour");
                    int price = in.nextInt();
                    System.out.println("Enter the size of playground");
                    int size = in.nextInt();
                    Playground playground = new Playground(PLocation, date, time, price, size);
                    Gofo.AddPlayground(playground);
            }
                if(ownerChoice==2){
                    break;
                }
                }
        }
        if(type==2){
            System.out.println("you are about to sign up as player");
            System.out.println("Enter your first name: ");
            String FirstName=in.next();
            System.out.println("Enter your last name: ");
            String LastName=in.next();
            System.out.println("Enter your e-mail: ");
            String Email=in.next();
            System.out.println("Enter your password: ");
            String password=in.next();
            System.out.println("Enter your location: ");
            String location=in.next();
            System.out.println("Enter your phone number: ");
            String phone=in.next();
            Player player=new Player(FirstName,LastName,Email,password,location,phone);
            Gofo.addPlayer(player);
            while(true){
            int playerChoice=player();
            if(playerChoice==1){
                System.out.println("you can search by the playground location and when you need to play");
                System.out.println("Enter location please");
                String PLocation=in.next();
                System.out.println("Enter Date");
                String date=in.next();
                Gofo.displayEwallet();
                Gofo.searchPlayground(PLocation,date);
            }
            if(playerChoice==2){
                System.out.println("you are about to make an Ewallet");
                System.out.println("please Enter an ID for your wallet");
                int ID=in.nextInt();
                System.out.println("Enter password for your wallet");
                String WPassword=in.next();
                System.out.println("Enter initial balance");
                int balance=in.nextInt();
                Ewallet user=new Ewallet(ID,WPassword,balance);
                Gofo.AddEwallet(user);
                user.AddEwallet(user);
                Gofo.displayEwallet();
            }
            if(playerChoice==3){
                break;
            }
            }
        }
        if(type==3){
            System.exit(0);
        }

        }
    }
}
