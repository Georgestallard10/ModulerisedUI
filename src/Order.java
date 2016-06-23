/**
 * Created by Georgestallard10 on 23/06/2016.
 */
public class Order {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    private int id;
    private Customer customer;

}
