import java.time.LocalDateTime;
import java.time.LocalDate;
public class Profile {
    private LocalDateTime lastLogged;
    private boolean loggedIn;
    private String profilePassword;
    private String userName;
    private LocalDate dateOfBirth;
    private String lastName;
    private String firstName;

    public void printProfile(){
        /**
         * This is a method that takes no parameters and returns no value, it prints the profile,
         * giving the Username, Name, date of birth, and time at which the user was last logged in
         *
         * >>>profile1.printprofile()
         * Username: AbodyMajeed
         * Name: Abody Majeed
         * D.O.B.: 2003-01-25
         * Last loggedin in: 2023-12-34A56:12:34.5678910
         */
         
        LinkedList<int> newlist = new LinkedList<int>();
        System.out.println("Username: " + firstName + lastName);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("D.O.B.: " + dateOfBirth);
        System.out.println("Last logged in: " + lastLogged);
    }
    public boolean checkPassword(String enteredPassword){
        /**
         * Checks if password is the same as password saved
         *
         * profile1.checkPassword("1111")
         * true
         */
        if(profilePassword.equals(enteredPassword)){
            loggedIn = true;
            setLastLogged();
            return true;
        }
        else{
            loggedIn = false;
            return false;
        }
    }
    public LocalDateTime getLastLogged(){
        return lastLogged;
    }

    public String getProfilePassword() {
        return profilePassword;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public void setDateOfBirth(String date) {
       dateOfBirth = LocalDate.parse(date);
    }

    private void setLastLogged() {
        lastLogged = LocalDateTime.now();
    }

    public void setProfilePassword(String profilePassword) {
        this.profilePassword = profilePassword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public Profile(){
        firstName = "Default first";
        lastName = "Default last";
        dateOfBirth = LocalDate.parse("2023-01-01");
        profilePassword = "Default Password";
        userName = firstName + lastName;
        loggedIn = false;
        lastLogged = LocalDateTime.now();


    }
}
