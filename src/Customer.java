import java.util.Date;

/**
 * Created by Georgestallard10 on 23/06/2016.
 */
public class Customer {
    private int id;
    private String firstmame;
    private String surname;
    private String address;
    private String phoneNumber;
    private String notes;
    private Date dataRegistered;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstmame() {
        return firstmame;
    }

    public void setFirstmame(String firstmame) {
        this.firstmame = firstmame;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getDataRegistered() {
        return dataRegistered;
    }

    public void setDataRegistered(Date dataRegistered) {
        this.dataRegistered = dataRegistered;
    }
}
