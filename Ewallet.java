import java.util.ArrayList;
import java.util.Scanner;

/**
 * class to handle Ewallets of the application users.
 */
public class Ewallet extends Playground {
    private int WalletID;
    private String Password;
    private float Balance;
    private ArrayList<Ewallet>Ewallets=new ArrayList<Ewallet>();

    /**
     * constructor to set the values of the Ewallet's details.
     * @param walletID id for Ewallet to access it
     * @param password password for the Ewallet.
     * @param balance the amount of money that eh Ewallet has.
     */
    public Ewallet(int walletID, String password, float balance) {
        WalletID = walletID;
        Password = password;
        Balance = balance;
    }

    /**
     * default constructor to set default values.
     */
    public Ewallet(){}

    /**
     * function to add Ewallet in ArrayList.
     * @param wallet specific wallet.
     */
    public void AddEwallet(Ewallet wallet){
        Ewallets.add(wallet);
    }

    /**
     * function to sign in specific ewallet and withdraw the money from it.
     * @param ID Ewallet Id.
     * @param password Ewallet password.
     * @return true if Ewallet is verified and the booking is done.
     */
    public boolean Signin(int ID,String password){
        boolean flag=false;
        for(int i=0;i<Ewallets.size();i++){
            Ewallets.get(i).setPassword(password);
            if((Ewallets.get(i).getWalletID()==ID)&&(Ewallets.get(i).getPassword()==password)){
                flag=true;
                Scanner in=new Scanner(System.in);
                System.out.println("enter the amount of money");
                int amountofMoney=in.nextInt();

                    Ewallets.get(i).Balance-=amountofMoney;
                    System.out.println("your money is sent and booking is done");
                    return true;
            }
        }
        if(flag==false){
            System.out.println("No matched Ewallet");
            return false;
        }
        else {return false;}
        }

    /**
     * Getter to get the wallet ID.
     * @return wallet ID.
     */
    public int getWalletID() {
        return WalletID;
    }

    /**
     * Setter for the ID
     * @param walletID ID of the wallet.
     */
    public void setWalletID(int walletID) {
        WalletID = walletID;
    }

    /**
     * Getter for password.
     * @return password of the wallet.
     */
    public String getPassword() {
        return Password;
    }

    /**
     * Setter for password.
     * @param password wallet password.
     */
    public void setPassword(String password) {
        Password = password;
    }
}


