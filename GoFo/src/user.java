public class user implements Iuser {
    private String name, location, password, phone, email;
    private int bookings ;

    public user(String name, String location, String password, String phone, String email) {
        this.name = name;
        this.location = location;
        this.password = password;
        this.phone = phone;
        this.email = email;
    }

    public user() {
        this.name = "";
        this.location = "";
        this.email = "";
        this.password = "";
        this.phone = "";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setBookings(int bookings) {
        this.bookings = bookings;
    }

    public int getBookings() {
       return bookings ; 
    }

    @Override
    public String toString() {
        return name + ", " + location + ", " + email + ", " + password + ", " + phone;
    }
}
