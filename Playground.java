/**
 * class to handle playground information.
 */
public class Playground {
    private String location;
    private String date;
    private int time;
    private int price;
    private double size;
    private int status;

    /**
     * default constructor to set default values for the attributes.
     */
    public Playground(){
        location=" ";
        date=" ";
        time=0;
        price=0;
        size=0.0;
        status=1;
    }

    /**
     * constructor ro set specific values for the attributes.
     * @param location playground location.
     * @param date playground date.
     * @param time playground available time.
     * @param price playground price.
     * @param size playground size.
     */
    public Playground(String location, String date, int time, int price, double size) {
        this.location = location;
        this.date = date;
        this.time = time;
        this.price = price;
        this.size = size;
        this.status=1;
    }

    /**
     * Getter for playground location.
     * @return playground location.
     */
    public String getLocation() {
        return location;
    }

    /**
     * Getter for playground Date.
     * @return playground Date.
     */
    public String getDate() {
        return date;
    }

    /**
     * Setter for status.
     * @param status playground status.
     */
    public void setStatus(int status){
        this.status=status;

    }

    /**
     * Getter for playground status.
     * @return playground status.
     */
    public int getStatus(){
        return status;
    }

    /**
     * Getter for playground available time
     * @return playground time.
     */
    public int getTime() {
        return time;
    }

    /**
     * overloading toString to print playground information.
     * @return playground information.
     */
    public String toString(){
        return "Location: "+ this.getLocation()+
                "\nDate: "+ this.getDate() +
                "\nTime: "+ this.getTime() +
                "\n Price: "+ this.getPrice() +
                "\nSize: "+ this.getSize() ;

    }

    /**
     * Getter for Price.
     * @return playground price.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Getter for playground size
     * @return playground Size.
     */
    public double getSize() {
        return size;
    }
}

