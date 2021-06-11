public class Playground {
    private String location;
    private String date;
    private int time;
    private int price;
    private double size;
    private int status;
    public Playground(){
        location=" ";
        date=" ";
        time=0;
        price=0;
        size=0.0;
        status=1;
    }

    public Playground(String location, String date, int time, int price, double size) {
        this.location = location;
        this.date = date;
        this.time = time;
        this.price = price;
        this.size = size;
        this.status=1;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }
    public void setStatus(int status){
        this.status=status;

    }
    public int getStatus(){
        return status;
    }
    public int getTime() {
        return time;
    }
    public String toString(){
        return "Location: "+ this.getLocation()+
                "\nDate: "+ this.getDate() +
                "\nTime: "+ this.getTime() +
                "\n Price: "+ this.getPrice() +
                "\nSize: "+ this.getSize() ;

    }
    public int getPrice() {
        return price;
    }

    public double getSize() {
        return size;
    }
}
