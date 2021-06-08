/**
 * class registering to register a user
 */

public class registering {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String location;
    private String phone;

    /**
     * default constructor
     */
    public registering(){}

    /**
     * parameterized constructor
     * @param firstName to get user first name
     * @param lastName  to get user last name
     * @param email to get user email
     * @param password to get user password
     * @param location to get user location
     * @param phone to get user phone number
     */
    public registering(String firstName, String lastName, String email, String password, String location, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.location = location;
        this.phone = phone;
    }

    /**
     * function to get first name
     * @return firstname
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * function to set first name
     * @param firstName user first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * function to get last name
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * function to set last name
     * @param lastName user last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * function to get user email
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * function to set user email.
     * @param email user email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * function to set user password
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * function to set password
     * @param password user password.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * function to  get user location
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /**
     * function to set user location.
     * @param location user location.
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * function to get user phone number
     * @return phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * function to set phone number.
     * @param phone user phone number.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * function to print user info
     * @return user info
     */
    public String toString(){
        return "First name: "+ this.getFirstName() +
                "\nLast name: "+ this.getLastName() +
                "\nemail: "+ this.getEmail() +
                "\n Password: "+ this.getPassword() +
                "\nLocation: "+ this.getLocation() +
                "\nPhone: "+ this.getPhone() ;
    }
}

/**
 * class player to specify usertype
 */
class Player extends registering{
    private String userType;

    /**
     * function to get usertype
     * @return usertype
     */
    public String getUserType() {
        return userType;
    }

    /**
     * function to set usertype
     * @param userType
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * parameterized constructor to register a user
     * @param firstName to get user first name
     * @param lastName  to get user last name
     * @param email to get user email
     * @param password to get user password
     * @param location to get user location
     * @param phone to get user phone number
     */
    public Player(String firstName, String lastName, String email, String password, String location, String phone) {
        super(firstName, lastName, email, password, location, phone);
        userType="Player";
        this.userType = userType;
    }

    /**
     * function to print user info
     * @return user info
     */
    public String toString(){
        return super.toString() +
                "\nuserTyoe: "+ this.getUserType() ;
    }
}
/**
 * class player to specify usertype
 */
class Owner extends registering{
    private String userType;
    /**
     * function to get usertype
     * @return usertype
     */
    public String getUserType() {
        return userType;
    }
    /**
     * function to set usertype
     * @param userType
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * parameterized constructor to register a user
     * @param firstName to get user first name
     * @param lastName  to get user last name
     * @param email to get user email
     * @param password to get user password
     * @param location to get user location
     * @param phone to get user phone number
     */
    public Owner(String firstName, String lastName, String email, String password, String location, String phone) {
        super(firstName, lastName, email, password, location, phone);
        userType="owner";
        this.userType = userType;
    }
    /**
     * function to print user info
     * @return user info
     */
    public String toString(){
        return super.toString() +
                "\nuserTyoe: "+ this.getUserType() ;
    }
}