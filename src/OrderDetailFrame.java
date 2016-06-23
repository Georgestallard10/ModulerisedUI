import javax.swing.*;

/**
 * Created by Georgestallard10 on 23/06/2016.
 */
public class OrderDetailFrame extends JFrame {
    public static final int HEIGHT = 400;
    public static final int WIDTH =300;

    public OrderDetailFrame (Order order){
        super();

        this.setLayout(null);
        this.setSize(WIDTH,HEIGHT);

        CustomerInfoPanel ciPanel = new CustomerInfoPanel(order.getCustomer());
        ciPanel.setBounds(30,30,ciPanel.getWidth(),ciPanel.getHeight());
        this.add(ciPanel);

        this.setVisible(true);

    }
}
