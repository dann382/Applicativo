package model;
import controller.Controller;
public class Utenti {
    private String username;
    private String password;


    public Utenti() {}

    public Utenti(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }


}