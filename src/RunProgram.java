/**
 * Created by Georgestallard10 on 23/06/2016.
 */
public class RunProgram {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(9239302);
        customer.setFirstmame("George");
        customer.setSurname("Stallard");
        customer.setAddress("wadebridge");
        customer.setPhoneNumber("1870747318");

        Order order = new Order();
        order.setId(1);
        order.setCustomer(customer);
        OrderDetailFrame odf = new OrderDetailFrame(order);
    }
}

