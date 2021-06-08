public interface Iuser {
    /**
     * method to return the usr name
     * @return the user name
     */
    public String getName();

    /**
     * method to set the user name
     * @param name
     */
    public void setName(String name);

    /**
     * method to return the location
     * @return the location of the user
     */
    public String getLocation();

    /**
     * method to set the location of the user
     * @param location of the user
     */
    public void setLocation(String location);

    /**
     * method to get the password of the user
     * @return the password of the user
     */
    public String getPassword();

    /**
     * method to set the pass word of the user
     * @param password of the user
     */
    public void setPassword(String password);

    /**
     * method to get the phone of the user
     * @return the phone of the user
     */
    public String getPhone() ;

    /**
     * method to return the phone of the user
     * @param phone of the user
     */
    public void setPhone(String phone);

    /**
     * method to get the email of the user
     * @return the email of the user
     */
    public String getEmail();

    /**
     * method to set the email of the user
     * @param email of the user
     */
    public void setEmail(String email);

    /**
     * method to set the bookings of the user
     * @param bookings of the user
     */
    public void setBookings(int bookings);

    /**
     * methos to get the bookings of the user
     * @return the bookings of the user
     */
    public int getBookings();


    @Override
    public String toString();


}
