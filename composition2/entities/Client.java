package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String name;
    private String email;
    private Date bithDate;

    public Client(String name, String email, Date bithDate) {
        this.name = name;
        this.email = email;
        this.bithDate = bithDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBithDate() {
        return bithDate;
    }

    public void setBithDate(Date bithDate) {
        this.bithDate = bithDate;
    }

    public String toString() {
        return name + " (" + sdf.format(bithDate) + ") - " + email;
    }

}
