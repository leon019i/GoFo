/**
 * @author loayFayez id:20190396
 * @version 1.8
 */

public class user implements Iuser {
    private String name, location, password, phone, email;
    private int bookings ;

    /**
     *  A parametrized constructor creates a user with specific credentials
     * @param name  the user's name
     * @param location the user's location
     * @param password the user's password
     * @param phone the user's phone number
     * @param email the user's Email
     */
    public user(String name, String location, String password, String phone, String email) {
        this.name = name;
        this.location = location;
        this.password = password;
        this.phone = phone;
        this.email = email;
    }

    /**
     * A default constructor creates a user with empty fields
     */
    public user() {
        this.name = "";
        this.location = "";
        this.email = "";
        this.password = "";
        this.phone = "";

    }

    /**
     * gets the user name
     * @return a string represent the user's name
     */
    public String getName() {
        return name;
    }

    /**
     * sets the user name
     * @param name a string contains the user's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * gets the user location
     * @return a string represent thr user's location
     */
    public String getLocation() {
        return location;
    }

    /**
     * sets the user location
     * @param location a string contains the user's location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * gets the users password
     * @return a string represents the user's password
     */
    public String getPassword() {
        return password;
    }

    /**
     * sets the user password
     * @param password a string contains the user's password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * gets the user phone number
     * @return a string represents the user's phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * sets the user phone number
     * @param phone a string contains the user's phone number
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * gets the user email
     * @return a string represents the user's email
     */
    public String getEmail() {
        return email;
    }

    /**
     * sets the user email
     * @param email a string contains the user's email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * sets the number of bookings
     * @param bookings a integer represents the booking number
     */
    public void setBookings(int bookings) {
        this.bookings = bookings;
    }

    /**
     * gets the booking number for a user
     * @return a string represents the number of booking s the user had booked
     */
    public int getBookings() {
       return bookings ; 
    }

    /**
     * overridden method to prints the user's credentials with a formal way
     * @return a string represents the user's credentials in a more readable way
     */
    @Override
    public String toString() {
        return name + ", " + location + ", " + email + ", " + password + ", " + phone;
    }
}
