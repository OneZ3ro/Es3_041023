package entities.es3;

import java.util.Random;

public class User {
    private int codeUser;
    private String name;
    private String surname;

    private String email;
    private String date = "15-10-2020";

    public int getCodeUser() {
        return codeUser;
    }

    public String getDate() {
        return date;
    }

    public User(String name, String surname, String email){
        Random rndm = new Random();
        this.codeUser = rndm.nextInt(1, 1000);
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
}
