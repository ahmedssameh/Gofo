import java.util.ArrayList;
import java.util.Scanner;

/**
 * class for system to handle the information of the system.
 */
public class gofo extends Ewallet {
    ArrayList<Player> players = new ArrayList<Player>();
    ArrayList<Owner> owners = new ArrayList<Owner>();
    public ArrayList<Ewallet>Ewallets=new ArrayList<Ewallet>();
    Ewallet wallet;
    public ArrayList<Playground>Playgrounds=new ArrayList<>();
    Playground TargetPlayground=new Playground();

    /**
     * a function to add a player in a players list.
     * @param player user wants to play in a playground.
     */
    public void addPlayer(Player player)
    {
        players.add(player);
    }

    /**
     * a function to add a owner in a owners list.
     * @param owner playground owner.
     */
    public void addOwner(Owner owner)
    {
        owners.add(owner);
    }

    /**
     * function to display players of the application.
     */
    public void displayPlayers()
    {
        for (int i = 0; i < players.size(); i++) {
            System.out.println("the player number "+ (i+1));
            System.out.println(players.get(i));
        }
    }

    /**
     * a function to add a wallet in a wallets list.
     * @param wallet Ewallet to be added.
     */
    public void AddEwallet(Ewallet wallet){
        Ewallets.add(wallet);
    }

    /**
     * function to add playground after taking permission of admin.
     * @param playground an object that need to be added in playgrounds list.
     */
    public void AddPlayground(Playground playground){
        String choice=permission();
        if(choice.toLowerCase().equals("yes")){
            Playgrounds.add(playground);
        }
        else if(choice.toLowerCase().equals("no")){
            System.out.println("your playground is not accepted");
        }
        else{
            System.out.println(":(");
        }
    }
    public void displayPlaygrounds()
    {
        for (int i = 0; i < Playgrounds.size(); i++) {
            System.out.println("the Playground number "+ (i+1));
            System.out.println(Playgrounds.get(i));
        }
    }

    /**
     * a function to search for a specific playground and take decision to book it or not.
     * @param Location playground location
     * @param Date available date for this playground.
     */
    public void searchPlayground(String Location,String Date) {
        Boolean flag=false;
        ArrayList<Playground>result =new ArrayList<Playground>();
        if((Playgrounds).size()==0){
            System.out.println("No Playgrounds are added in the application");
        }else {
            for (int i = 0; i <(Playgrounds).size();i++){
                if(Playgrounds.get(i).getLocation()==Location&& Playgrounds.get(i).getDate()==Date){
                    flag=true;
                    System.out.println(Playgrounds.get(i).toString());
                    Scanner in=new Scanner(System.in);
                    System.out.println("do you want to book this or not?");
                    String Choice=in.next();
                    if(Choice.toLowerCase().equals("yes")){
                        System.out.println("Enter payment way");
                        String payment=in.next();
                        if(payment.toLowerCase().equals("cash")){
                            System.out.println("you will pay to the playground owner thanks!");
                        }
                        else {
                            System.out.println("Enter ID");
                            int ID = in.nextInt();
                            System.out.println("Enter Password");
                            String password = in.next();
                            if (Ewallets.get(0).Signin(ID, password)) {
                                Playgrounds.get(i).setStatus(0);
                            }
                        }
                        break;
                    }else if(Choice.toLowerCase().equals("no")){
                        continue;
                    }else{
                        System.out.println("Error");
                    }
                }
            }
            if(flag==false){
                System.out.println("Playground with this location and date is not available");
            }
        }
    }

    /**
     * function to display playgrounds owners of the application
     */
    public void displayOwners()
    {

        for (int i = 0; i < owners.size(); i++) {
            System.out.println("the owner number "+ (i+1));
            System.out.println(owners.get(i));
        }
    }

    /**
     * function to detect the admin decision for adding a playground.
     * @return an answer for adding or not.
     */
    public String permission(){
        System.out.println("do you want to accept this playground");
        Scanner in=new Scanner(System.in);
        String answer=in.next();
        if(answer.toLowerCase().equals("yes")){
            return "yes";
        }
        else if(answer.toLowerCase().equals("no")){
            return "no";
        }
        else{
            return "Error";
        }
    }

    /**
     * function for admin to delete a playground
     * @param play playground that needed to be deleted.
     */
    public void removePlayground(Playground play){
        Playgrounds.remove(play);
    }
}