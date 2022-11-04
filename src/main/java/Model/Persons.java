package Model;

public class Persons {

    private String firstName;
    private String lastname;
    private String userName;
    private String email;
    private String password;
    private String confPassword;

    public Persons() {
    }

    public Persons(String firstName, String lastname, String userName, String email, String password, String confPassword) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.confPassword = confPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfPassword() {
        return confPassword;
    }

    public void setConfPassword(String confPassword) {
        this.confPassword = confPassword;
    }
}
