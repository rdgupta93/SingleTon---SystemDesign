package Adapter;

public class User {
    private final String userName;
    private final String password;

    public User(String Username, String password) {
        this.userName = Username;
        this.password = password;
    }

    public String getName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
