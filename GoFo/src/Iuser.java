public interface Iuser {
    public String getName();
    public void setName(String name);
    public String getLocation();
    public void setLocation(String location);

    public String getPassword();

    public void setPassword(String password);

    public String getPhone() ;
    public void setPhone(String phone);

    public String getEmail();

    public void setEmail(String email);
    public void setBookings(int bookings);

    public int getBookings();

    @Override
    public String toString();


}
