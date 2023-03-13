package javaBeans;

import java.io.Serializable;

public class Authors implements Serializable {

    private int id;
    private String firstName;
    private String lastName;

    public Authors() {}

    public Authors(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
