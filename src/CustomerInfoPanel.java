import javafx.embed.swt.CustomTransferBuilder;

import javax.swing.*;

/**
 * Created by Georgestallard10 on 23/06/2016.
 */
public class CustomerInfoPanel extends JPanel {
    public static final int HEIGHT = 450;
    public static final int WIDTH =400;
    public CustomerInfoPanel(Customer customer){
        super();

        this.setLayout(null);
        this.setSize(WIDTH,HEIGHT);

        JLabel title = new JLabel("Customer Details");
        title.setBounds(0,0,WIDTH,45);
        this.add(title);

        JLabel nameLable = new JLabel();
        nameLable.setText("Name: "+ customer.getFirstmame() + " " + customer.getSurname());
        nameLable.setBounds (75,75,150,30);
        this.add(nameLable);
        this.setVisible(true);

    }
}
