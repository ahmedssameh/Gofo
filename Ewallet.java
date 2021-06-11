import java.util.ArrayList;
import java.util.Scanner;

public class Ewallet extends Playground {
    private int WalletID;
    private String Password;
    private float Balance;
    private ArrayList<Ewallet>Ewallets=new ArrayList<Ewallet>();
    public Ewallet(int walletID, String password, float balance) {
        WalletID = walletID;
        Password = password;
        Balance = balance;
    }
    public Ewallet(){}
    public void AddEwallet(Ewallet wallet){
        Ewallets.add(wallet);
    }
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

    public int getWalletID() {
        return WalletID;
    }

    public void setWalletID(int walletID) {
        WalletID = walletID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}


